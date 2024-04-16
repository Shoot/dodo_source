package com.huawei.hms.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ProfileTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.ProfileReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
/* loaded from: classes3.dex */
public class HmsProfile {
    public static final int CUSTOM_PROFILE = 2;
    public static final int HUAWEI_PROFILE = 1;
    public static final String a = "HmsProfile";
    public Context b;
    public HuaweiApi<Api.ApiOptions.NoOptions> c;

    public HmsProfile(Context context) {
        this.b = null;
        Preconditions.checkNotNull(context);
        this.b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.c = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static HmsProfile getInstance(Context context) {
        return new HmsProfile(context);
    }

    public final v6b<Void> a(int i, String str, int i2, String str2) {
        if (!isSupportProfile()) {
            z6b z6bVar = new z6b();
            z6bVar.b(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException());
            return z6bVar.a();
        }
        if (!TextUtils.isEmpty(str)) {
            String a2 = a(this.b);
            if (TextUtils.isEmpty(a2)) {
                HMSLog.i(a, "agc connect services config missing project id.");
                z6b z6bVar2 = new z6b();
                z6bVar2.b(ErrorEnum.ERROR_MISSING_PROJECT_ID.toApiException());
                return z6bVar2.a();
            } else if (str.equals(a2)) {
                str = "";
            }
        }
        ProfileReq profileReq = new ProfileReq();
        if (i == 0) {
            profileReq.setOperation(0);
            profileReq.setType(i2);
        } else {
            profileReq.setOperation(1);
        }
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_PROFILE);
        try {
            profileReq.setSubjectId(str);
            profileReq.setProfileId(iq9.b(str2));
            profileReq.setPkgName(this.b.getPackageName());
            return this.c.doWrite(new ProfileTask(PushNaming.PUSH_PROFILE, JsonUtil.createJsonString(profileReq), reportEntry));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                z6b z6bVar3 = new z6b();
                ApiException apiException = (ApiException) e.getCause();
                z6bVar3.b(apiException);
                PushBiUtil.reportExit(this.b, PushNaming.PUSH_PROFILE, reportEntry, apiException.getStatusCode());
                return z6bVar3.a();
            }
            z6b z6bVar4 = new z6b();
            Context context = this.b;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            PushBiUtil.reportExit(context, PushNaming.PUSH_PROFILE, reportEntry, errorEnum);
            z6bVar4.b(errorEnum.toApiException());
            return z6bVar4.a();
        }
    }

    public v6b<Void> addProfile(int i, String str) {
        return addProfile("", i, str);
    }

    public final boolean b(Context context) {
        if (s.b(context) >= 110001400) {
            return true;
        }
        return false;
    }

    public v6b<Void> deleteProfile(String str) {
        return deleteProfile("", str);
    }

    public boolean isSupportProfile() {
        if (s.d(this.b)) {
            if (s.c()) {
                HMSLog.i(a, "current EMUI version below 9.1, not support profile operation.");
                return false;
            } else if (!b(this.b)) {
                HMSLog.i(a, "current HwPushService.apk version below 11.0.1.400,please upgrade your HwPushService.apk version.");
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public v6b<Void> addProfile(String str, int i, String str2) {
        if (i != 1 && i != 2) {
            HMSLog.i(a, "add profile type undefined.");
            z6b z6bVar = new z6b();
            z6bVar.b(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return z6bVar.a();
        } else if (TextUtils.isEmpty(str2)) {
            HMSLog.i(a, "add profile params is empty.");
            z6b z6bVar2 = new z6b();
            z6bVar2.b(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return z6bVar2.a();
        } else {
            return a(0, str, i, str2);
        }
    }

    public v6b<Void> deleteProfile(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            HMSLog.e(a, "del profile params is empty.");
            z6b z6bVar = new z6b();
            z6bVar.b(ErrorEnum.ERROR_PUSH_ARGUMENTS_INVALID.toApiException());
            return z6bVar.a();
        }
        return a(1, str, -1, str2);
    }

    public static String a(Context context) {
        return z.d(context).a("client/project_id");
    }
}
