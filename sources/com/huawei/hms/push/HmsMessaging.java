package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import im.threads.business.transport.MessageAttributes;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";
    public static final Pattern a = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
    public Context b;
    public HuaweiApi<Api.ApiOptions.NoOptions> c;

    public HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.c = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        HmsMessaging hmsMessaging;
        synchronized (HmsMessaging.class) {
            hmsMessaging = new HmsMessaging(context);
        }
        return hmsMessaging;
    }

    public final v6b<Void> a(String str, String str2) {
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.SUBSCRIBE);
        if (str != null && a.matcher(str).matches()) {
            if (ProxyCenter.getProxy() != null) {
                HMSLog.i("HmsMessaging", "use proxy subscribe.");
                return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.b, str, reportEntry) : ProxyCenter.getProxy().unsubscribe(this.b, str, reportEntry);
            }
            try {
                ErrorEnum a2 = d.a(this.b);
                if (a2 == ErrorEnum.SUCCESS) {
                    if (NetWorkUtil.getNetworkType(this.b) != 0) {
                        SubscribeReq subscribeReq = new SubscribeReq(this.b, str2, str);
                        subscribeReq.setToken(BaseUtils.getLocalToken(this.b, null));
                        if (s.b()) {
                            return this.c.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
                        }
                        return this.c.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), reportEntry));
                    }
                    HMSLog.e("HmsMessaging", "no network");
                    throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
                }
                throw a2.toApiException();
            } catch (ApiException e) {
                z6b z6bVar = new z6b();
                z6bVar.b(e);
                PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE, reportEntry, e.getStatusCode());
                return z6bVar.a();
            } catch (Exception unused) {
                z6b z6bVar2 = new z6b();
                ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
                z6bVar2.b(errorEnum.toApiException());
                PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE, reportEntry, errorEnum);
                return z6bVar2.a();
            }
        }
        PushBiUtil.reportExit(this.b, PushNaming.SUBSCRIBE, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
        HMSLog.e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.b);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() == null) {
            HMSLog.i("HmsMessaging", "send upstream message");
            a(remoteMessage);
            return;
        }
        HMSLog.e("HmsMessaging", "Operation(send) unsupported");
        throw new UnsupportedOperationException("Operation(send) unsupported");
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.b, z);
    }

    public v6b<Void> subscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke subscribe");
        return a(str, "Sub");
    }

    public v6b<Void> turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.b, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOffPush");
        return a(false);
    }

    public v6b<Void> turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.b, null);
        }
        HMSLog.i("HmsMessaging", "invoke turnOnPush");
        return a(true);
    }

    public v6b<Void> unsubscribe(String str) {
        HMSLog.i("HmsMessaging", "invoke unsubscribe");
        return a(str, "UnSub");
    }

    public final void a(RemoteMessage remoteMessage) {
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.UPSEND_MSG);
        ErrorEnum a2 = d.a(this.b);
        if (a2 == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.b.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (s.b()) {
                            this.c.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), reportEntry));
                            return;
                        } else {
                            a(upSendMsgReq, reportEntry);
                            return;
                        }
                    }
                    HMSLog.e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    throw new IllegalArgumentException("Mandatory parameter 'data' missing");
                }
                HMSLog.e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
            }
            HMSLog.e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, reportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        }
        HMSLog.e("HmsMessaging", "Message sent failed:" + a2.getExternalCode() + CoreConstants.COLON_CHAR + a2.getMessage());
        PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, reportEntry, a2);
        throw new UnsupportedOperationException(a2.getMessage());
    }

    public final v6b<Void> a(boolean z) {
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.SET_NOTIFY_FLAG);
        if (s.d(this.b) && !s.b()) {
            if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
                HMSLog.e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
                z6b z6bVar = new z6b();
                ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
                z6bVar.b(errorEnum.toApiException());
                PushBiUtil.reportExit(this.b, PushNaming.SET_NOTIFY_FLAG, reportEntry, errorEnum);
                return z6bVar.a();
            } else if (s.b(this.b) < 90101310) {
                HMSLog.i("HmsMessaging", "turn on/off with broadcast v1");
                Context context = this.b;
                Intent putExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(context, this.b.getPackageName() + "#" + z));
                putExtra.setPackage("android");
                return n7b.b(new IntentCallable(this.b, putExtra, reportEntry));
            } else {
                HMSLog.i("HmsMessaging", "turn on/off with broadcast v2");
                new PushPreferences(this.b, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
                Uri parse = Uri.parse("content://" + this.b.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
                Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
                intent.putExtra(MessageAttributes.TYPE, "enalbeFlag");
                intent.putExtra("pkgName", this.b.getPackageName());
                intent.putExtra(RemoteMessageConst.Notification.URL, parse);
                intent.setPackage("android");
                return n7b.b(new IntentCallable(this.b, intent, reportEntry));
            }
        }
        HMSLog.i("HmsMessaging", "turn on/off with AIDL");
        EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
        enableNotifyReq.setPackageName(this.b.getPackageName());
        enableNotifyReq.setEnable(z);
        return this.c.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), reportEntry));
    }

    public final void a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.b, null));
        try {
            this.c.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, str, ((ApiException) e.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.b, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
