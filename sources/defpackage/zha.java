package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: SharedPreferencesManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzha;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "k", "", "f", "", Action.KEY_ATTRIBUTE, "value", Image.TYPE_HIGH, "j", "i", "", "g", "defaultValue", DateTokenConverter.CONVERTER_KEY, "b", com.huawei.hms.opendevice.c.a, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zha  reason: default package */
/* loaded from: classes.dex */
public final class zha {
    public static final zha a = new zha();
    private static SharedPreferences b;

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Boolean> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            return Boolean.valueOf(sharedPreferences.getBoolean(this.a, this.b));
        }
    }

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Integer> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            return Integer.valueOf(sharedPreferences.getInt(this.a, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: zha$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            return sharedPreferences.getString(this.a, this.b);
        }
    }

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString(this.a, this.b).apply();
        }
    }

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putBoolean(this.a, this.b).apply();
        }
    }

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, int i) {
            super(0);
            this.a = str;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putInt(this.a, this.b).apply();
        }
    }

    /* compiled from: SharedPreferencesManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zha$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<Boolean> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            SharedPreferences sharedPreferences = zha.b;
            if (sharedPreferences == null) {
                z65.z("preferences");
                sharedPreferences = null;
            }
            return Boolean.valueOf(sharedPreferences.edit().putString(this.a, this.b).commit());
        }
    }

    private zha() {
    }

    public static /* synthetic */ String e(zha zhaVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return zhaVar.d(str, str2);
    }

    public final boolean b(String str, boolean z) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return ((Boolean) yx5.a.b(Boolean.valueOf(z), new a(str, z))).booleanValue();
    }

    public final int c(String str, int i) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return ((Number) yx5.a.b(Integer.valueOf(i), new b(str, i))).intValue();
    }

    public final String d(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return (String) yx5.a.b(str2, new c(str, str2));
    }

    public final boolean f() {
        if (b != null) {
            return true;
        }
        return false;
    }

    public final void g(String str, int i) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        yx5.a.d(new f(str, i));
    }

    public final void h(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        yx5.a.d(new d(str, str2));
    }

    public final void i(String str, boolean z) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        yx5.a.d(new e(str, z));
    }

    public final void j(String str, String str2) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        yx5.a.d(new g(str, str2));
    }

    public final void k(Context context) {
        Application application;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (!f()) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            } else {
                application = null;
            }
            if (application != null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("preferences", 0);
                z65.g(sharedPreferences, "it.getSharedPreferences(…ME, Context.MODE_PRIVATE)");
                b = sharedPreferences;
            }
        }
    }
}
