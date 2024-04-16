package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.api.entity.core.CommonCode;
import defpackage.s5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u0000 \u00112\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0005\u0011\u0012\u0013\b\nB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0014"}, d2 = {"Lv5;", "Ls5;", "Lv58;", "Landroid/net/Uri;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "Ls5$a;", com.huawei.hms.push.e.a, "", "resultCode", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "f", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v5  reason: default package */
/* loaded from: classes.dex */
public class v5 extends s5<v58, Uri> {
    public static final a a = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\f\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00108\u0006X\u0086T¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u0012\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001c"}, d2 = {"Lv5$a;", "", "", "f", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, com.huawei.hms.push.e.a, "(Landroid/content/Context;)Z", "Landroid/content/pm/ResolveInfo;", "b", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", DateTokenConverter.CONVERTER_KEY, "a", "Lv5$e;", "input", "", com.huawei.hms.opendevice.c.a, "(Lv5$e;)Ljava/lang/String;", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "Ljava/lang/String;", "getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations", "()V", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "<init>", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(e eVar) {
            z65.h(eVar, "input");
            if (eVar instanceof c) {
                return "image/*";
            }
            if (eVar instanceof d) {
                return ((d) eVar).a();
            }
            if (eVar instanceof b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean d(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (a(context) != null) {
                return true;
            }
            return false;
        }

        public final boolean e(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (b(context) != null) {
                return true;
            }
            return false;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final boolean f() {
            int extensionVersion;
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return true;
            }
            if (i >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5$b;", "Lv5$e;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v5$b */
    /* loaded from: classes.dex */
    public static final class b implements e {
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5$c;", "Lv5$e;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v5$c */
    /* loaded from: classes.dex */
    public static final class c implements e {
        public static final c a = new c();

        private c() {
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lv5$d;", "Lv5$e;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "mimeType", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v5$d */
    /* loaded from: classes.dex */
    public static final class d implements e {
        private final String a;

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lv5$e;", "", "Lv5$b;", "Lv5$c;", "Lv5$d;", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v5$e */
    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // defpackage.s5
    /* renamed from: d */
    public Intent a(Context context, v58 v58Var) {
        Intent intent;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(v58Var, "input");
        a aVar = a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(v58Var.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo b2 = aVar.b(context);
            if (b2 != null) {
                ActivityInfo activityInfo = b2.activityInfo;
                intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(aVar.c(v58Var.a()));
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else if (aVar.d(context)) {
            ResolveInfo a2 = aVar.a(context);
            if (a2 != null) {
                ActivityInfo activityInfo2 = a2.activityInfo;
                intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(aVar.c(v58Var.a()));
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(v58Var.a()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            return intent3;
        }
        return intent;
    }

    @Override // defpackage.s5
    /* renamed from: e */
    public final s5.a<Uri> b(Context context, v58 v58Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(v58Var, "input");
        return null;
    }

    @Override // defpackage.s5
    /* renamed from: f */
    public final Uri c(int i, Intent intent) {
        Object b0;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            b0 = sc1.b0(t5.a.a(intent));
            data = (Uri) b0;
        }
        return data;
    }
}
