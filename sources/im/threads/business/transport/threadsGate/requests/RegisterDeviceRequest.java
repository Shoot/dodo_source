package im.threads.business.transport.threadsGate.requests;

import im.threads.business.transport.MessageAttributes;
import im.threads.business.transport.threadsGate.Action;
import kotlin.Metadata;
/* compiled from: RegisterDeviceRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lim/threads/business/transport/threadsGate/requests/RegisterDeviceRequest;", "Lim/threads/business/transport/threadsGate/requests/BaseRequest;", "Lim/threads/business/transport/threadsGate/requests/RegisterDeviceRequest$Data;", "correlationId", "", "data", "(Ljava/lang/String;Lim/threads/business/transport/threadsGate/requests/RegisterDeviceRequest$Data;)V", "Data", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegisterDeviceRequest extends BaseRequest<Data> {

    /* compiled from: RegisterDeviceRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lim/threads/business/transport/threadsGate/requests/RegisterDeviceRequest$Data;", "", "appPackage", "", "appVersion", "providerUid", "pnsPushAddress", "deviceUid", "osName", "osVersion", "locale", "timeZone", "deviceName", "deviceModel", MessageAttributes.DEVICE_ADDRESS, MessageAttributes.CLIENT_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Data {
        private final String appPackage;
        private final String appVersion;
        private final String clientId;
        private final String deviceAddress;
        private final String deviceModel;
        private final String deviceName;
        private final String deviceUid;
        private final String locale;
        private final String osName;
        private final String osVersion;
        private final String pnsPushAddress;
        private final String providerUid;
        private final String timeZone;

        public Data(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            z65.h(str, "appPackage");
            z65.h(str2, "appVersion");
            z65.h(str3, "providerUid");
            z65.h(str5, "deviceUid");
            z65.h(str6, "osName");
            z65.h(str7, "osVersion");
            z65.h(str8, "locale");
            z65.h(str9, "timeZone");
            z65.h(str10, "deviceName");
            z65.h(str11, "deviceModel");
            this.appPackage = str;
            this.appVersion = str2;
            this.providerUid = str3;
            this.pnsPushAddress = str4;
            this.deviceUid = str5;
            this.osName = str6;
            this.osVersion = str7;
            this.locale = str8;
            this.timeZone = str9;
            this.deviceName = str10;
            this.deviceModel = str11;
            this.deviceAddress = str12;
            this.clientId = str13;
        }
    }

    public RegisterDeviceRequest(String str, Data data) {
        super(Action.REGISTER_DEVICE, str, data);
    }
}
