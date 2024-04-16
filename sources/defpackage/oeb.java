package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ThreadsLibContextLocaleFix.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0004B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Loeb;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "b", "Lih;", "a", "Lih;", "androidLanguageManager", "<init>", "(Lih;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oeb  reason: default package */
/* loaded from: classes.dex */
public final class oeb {
    private final ih a;

    /* compiled from: ThreadsLibContextLocaleFix.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Loeb$a;", "Landroid/content/ContextWrapper;", "Landroid/content/res/Resources;", "getResources", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Loeb;Landroid/content/Context;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oeb$a */
    /* loaded from: classes.dex */
    private final class a extends ContextWrapper {
        final /* synthetic */ oeb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oeb oebVar, Context context) {
            super(oebVar.a.b(context));
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            this.a = oebVar;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources getResources() {
            Resources resources = super.getResources();
            ih ihVar = this.a.a;
            z65.e(resources);
            ihVar.c(resources);
            return resources;
        }
    }

    /* compiled from: ThreadsLibContextLocaleFix.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Loeb$b;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "getApplicationContext", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: oeb$b */
    /* loaded from: classes.dex */
    private static final class b extends ContextWrapper {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context getApplicationContext() {
            Context baseContext = getBaseContext();
            z65.g(baseContext, "getBaseContext(...)");
            return baseContext;
        }
    }

    public oeb(ih ihVar) {
        z65.h(ihVar, "androidLanguageManager");
        this.a = ihVar;
    }

    public final Context b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new b(new a(this, context));
    }
}
