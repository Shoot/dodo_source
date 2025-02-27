package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
/* loaded from: classes.dex */
public class AvailableAdapter {
    public final int a;
    public AvailableCallBack b;
    public SystemObserver d = new a();
    public boolean c = false;

    /* loaded from: classes.dex */
    public interface AvailableCallBack {
        void onComplete(int i);
    }

    /* loaded from: classes.dex */
    public class a implements SystemObserver {
        public a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.a();
            if (a == null) {
                HMSLog.e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            a.onComplete(i);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.a();
            if (a == null) {
                HMSLog.e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            a.onComplete(i);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.a = i;
    }

    public final AvailableCallBack a() {
        return this.b;
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a2 = a(context);
        if (a2 != 0) {
            return a2;
        }
        if (HMSPackageManager.getInstance(context).isApkNeedUpdate(this.a)) {
            HMSLog.i("AvailableAdapter", "The current version does not meet the target version requirements");
            return 2;
        }
        return a2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a2 = a(context);
        if (a2 != 0) {
            return a2;
        }
        if (HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.a)) {
            HMSLog.i("AvailableAdapter", "The current version does not meet the minimum version requirements");
            return 2;
        }
        return a2;
    }

    public boolean isUserNoticeError(int i) {
        if (i != 29) {
            return false;
        }
        return true;
    }

    public boolean isUserResolvableError(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public void setCalledBySolutionInstallHms(boolean z) {
        this.c = z;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity != null && availableCallBack != null) {
            if (UIUtil.isBackground(activity)) {
                HMSLog.i("AvailableAdapter", "current app is in Background");
                availableCallBack.onComplete(28);
                return;
            }
            HMSLog.i("AvailableAdapter", "startNotice");
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity != null && availableCallBack != null) {
            if (UIUtil.isBackground(activity)) {
                HMSLog.i("AvailableAdapter", "current app is in Background");
                availableCallBack.onComplete(28);
            } else if (!a(activity)) {
                a(activity, availableCallBack);
            } else {
                HMSLog.i("AvailableAdapter", "startResolution");
                this.b = availableCallBack;
                SystemManager.getSystemNotifier().registerObserver(this.d);
                Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
                intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.a);
                if (this.c) {
                    intentStartBridgeActivity.putExtra("installHMS", "installHMS");
                }
                intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, true);
                activity.startActivity(intentStartBridgeActivity);
            }
        }
    }

    public final int a(Context context) {
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is not installed");
            return 1;
        } else if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is spoofed");
            return 29;
        } else if (PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is disabled");
            return 3;
        } else {
            return 0;
        }
    }

    public final void a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    public final boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() >= 40000000) {
            HMSLog.i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
            return true;
        }
        return false;
    }
}
