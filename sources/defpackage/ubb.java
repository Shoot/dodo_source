package defpackage;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cg5;
import defpackage.fg5;
import defpackage.qw4;
import java.util.concurrent.Executor;
import kotlin.Metadata;
/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\bH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "i", "Lrw4;", "imeOptions", "Lvab;", "textFieldValue", Image.TYPE_HIGH, "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", DateTokenConverter.CONVERTER_KEY, "", "bits", "flag", "", "g", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ubb  reason: default package */
/* loaded from: classes.dex */
public final class ubb {
    public static final Executor d(final Choreographer choreographer) {
        z65.h(choreographer, "<this>");
        return new Executor() { // from class: sbb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ubb.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        z65.h(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: tbb
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ubb.f(runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j) {
        runnable.run();
    }

    private static final boolean g(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public static final void h(EditorInfo editorInfo, rw4 rw4Var, vab vabVar) {
        z65.h(editorInfo, "<this>");
        z65.h(rw4Var, "imeOptions");
        z65.h(vabVar, "textFieldValue");
        int d = rw4Var.d();
        qw4.a aVar = qw4.b;
        int i = 6;
        if (qw4.l(d, aVar.a())) {
            if (!rw4Var.f()) {
                i = 0;
            }
        } else if (qw4.l(d, aVar.e())) {
            i = 1;
        } else if (qw4.l(d, aVar.c())) {
            i = 2;
        } else if (qw4.l(d, aVar.d())) {
            i = 5;
        } else if (qw4.l(d, aVar.f())) {
            i = 7;
        } else if (qw4.l(d, aVar.g())) {
            i = 3;
        } else if (qw4.l(d, aVar.h())) {
            i = 4;
        } else if (!qw4.l(d, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int e = rw4Var.e();
        fg5.a aVar2 = fg5.a;
        if (fg5.k(e, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (fg5.k(e, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (fg5.k(e, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (fg5.k(e, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (fg5.k(e, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (fg5.k(e, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (fg5.k(e, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (fg5.k(e, aVar2.e())) {
            editorInfo.inputType = 18;
        } else if (fg5.k(e, aVar2.b())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!rw4Var.f() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (qw4.l(rw4Var.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int c = rw4Var.c();
            cg5.a aVar3 = cg5.a;
            if (cg5.f(c, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (cg5.f(c, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (cg5.f(c, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (rw4Var.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = jcb.j(vabVar.b());
        editorInfo.initialSelEnd = jcb.g(vabVar.b());
        yd3.f(editorInfo, vabVar.c());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (!e.h()) {
            return;
        }
        e.b().u(editorInfo);
    }
}
