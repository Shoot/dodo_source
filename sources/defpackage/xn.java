package defpackage;

import android.app.Application;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: AppContextModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Landroid/app/Application;", "application", "Lwn;", "a", "sdk_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: xn  reason: default package */
/* loaded from: classes.dex */
public final class xn {

    /* compiled from: AppContextModule.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"xn$a", "Lwn;", "Landroid/app/Application;", Image.TYPE_HIGH, "()Landroid/app/Application;", "appContext", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: xn$a */
    /* loaded from: classes.dex */
    public static final class a implements wn {
        final /* synthetic */ Application a;

        a(Application application) {
            this.a = application;
        }

        @Override // defpackage.wn
        public Application h() {
            return this.a;
        }
    }

    public static final wn a(Application application) {
        z65.h(application, "application");
        return new a(application);
    }
}
