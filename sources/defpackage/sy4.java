package defpackage;

import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.backend.domain.inapp.AnimatedImageDto;
import ru.dodopizza.backend.domain.inapp.InAppNotificationApi;
import ru.dodopizza.backend.domain.inapp.InAppNotificationDto;
/* compiled from: InAppNotificationService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lsy4;", "", "Lru/dodopizza/backend/domain/inapp/AnimatedImageDto;", "dto", "Lfk;", "a", "Lry4;", c.a, "", MessageAttributes.UUID, "", "b", "Lru/dodopizza/backend/domain/inapp/InAppNotificationApi;", "Lru/dodopizza/backend/domain/inapp/InAppNotificationApi;", "inAppNotificationApi", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lru/dodopizza/backend/domain/inapp/InAppNotificationApi;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sy4  reason: default package */
/* loaded from: classes4.dex */
public final class sy4 {
    private final InAppNotificationApi a;
    private final hq3 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppNotificationService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: sy4$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return uy4.e.getValue();
        }
    }

    public sy4(InAppNotificationApi inAppNotificationApi, hq3 hq3Var) {
        z65.h(inAppNotificationApi, "inAppNotificationApi");
        z65.h(hq3Var, "featureService");
        this.a = inAppNotificationApi;
        this.b = hq3Var;
    }

    private final fk a(AnimatedImageDto animatedImageDto) {
        if (animatedImageDto != null) {
            return new fk(animatedImageDto.getDarkThemeUrl(), animatedImageDto.getLightThemeUrl());
        }
        return null;
    }

    public final void b(String str) {
        z65.h(str, MessageAttributes.UUID);
        this.a.sendNotificationClosed(str);
    }

    public final ry4 c() {
        boolean z;
        Object D;
        String str;
        InAppNotificationDto[] inAppNotification = this.a.getInAppNotification();
        if (inAppNotification.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            D = yr.D(inAppNotification);
            InAppNotificationDto inAppNotificationDto = (InAppNotificationDto) D;
            boolean a2 = this.b.a(bq3.j6);
            String id = inAppNotificationDto.getId();
            String typeDescription = inAppNotificationDto.getTypeDescription();
            if (typeDescription == null) {
                typeDescription = "";
            }
            String e = mh5.e(typeDescription, a.a);
            String title = inAppNotificationDto.getTitle();
            String description = inAppNotificationDto.getDescription();
            if (description == null) {
                str = "";
            } else {
                str = description;
            }
            return new ry4(id, e, title, str, inAppNotificationDto.getClickUrl(), ug6.b(inAppNotificationDto.getImage(), a2), a(inAppNotificationDto.getAnimatedImage()), inAppNotificationDto.getValue(), ((Number) mh5.c(inAppNotificationDto.getTheme(), 0)).intValue());
        }
        return null;
    }
}
