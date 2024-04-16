package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.task.ConsentTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableConsentReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.utils.JsonUtil;
/* loaded from: classes3.dex */
public class HmsConsent {
    public HuaweiApi<Api.ApiOptions.NoOptions> a;
    public Context b;

    public HmsConsent(Context context) {
        Preconditions.checkNotNull(context);
        this.b = context;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(context, new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, new PushClientBuilder());
        this.a = huaweiApi;
        huaweiApi.setKitSdkVersion(60500300);
    }

    public static HmsConsent getInstance(Context context) {
        return new HmsConsent(context);
    }

    public final v6b<Void> a(boolean z) {
        z6b z6bVar;
        int externalCode;
        String reportEntry = PushBiUtil.reportEntry(this.b, PushNaming.PUSH_CONSENT);
        try {
            if (s.d(this.b)) {
                EnableConsentReq enableConsentReq = new EnableConsentReq();
                enableConsentReq.setPackageName(this.b.getPackageName());
                enableConsentReq.setEnable(z);
                return this.a.doWrite(new ConsentTask(PushNaming.PUSH_CONSENT, JsonUtil.createJsonString(enableConsentReq), reportEntry));
            }
            throw ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.toApiException();
        } catch (ApiException e) {
            z6b z6bVar2 = new z6b();
            z6bVar2.b(e);
            externalCode = e.getStatusCode();
            z6bVar = z6bVar2;
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, reportEntry, externalCode);
            return z6bVar.a();
        } catch (Exception unused) {
            z6bVar = new z6b();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            z6bVar.b(errorEnum.toApiException());
            externalCode = errorEnum.getExternalCode();
            PushBiUtil.reportExit(this.b, PushNaming.PUSH_CONSENT, reportEntry, externalCode);
            return z6bVar.a();
        }
    }

    public v6b<Void> consentOff() {
        return a(false);
    }

    public v6b<Void> consentOn() {
        return a(true);
    }
}
