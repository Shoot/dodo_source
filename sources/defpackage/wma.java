package defpackage;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: SingleTouchListener.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "", "action", "b", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wma  reason: default package */
/* loaded from: classes.dex */
public final class wma {

    /* compiled from: SingleTouchListener.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"wma$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "p0", "", "onSingleTapUp", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wma$a */
    /* loaded from: classes.dex */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        final /* synthetic */ Function0<Unit> a;

        a(Function0<Unit> function0) {
            this.a = function0;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            z65.h(motionEvent, "p0");
            this.a.invoke();
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void b(View view, Function0<Unit> function0) {
        z65.h(view, "<this>");
        z65.h(function0, "action");
        final af4 af4Var = new af4(view.getContext(), new a(function0));
        view.setOnTouchListener(new View.OnTouchListener() { // from class: vma
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean c;
                c = wma.c(af4.this, view2, motionEvent);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(af4 af4Var, View view, MotionEvent motionEvent) {
        z65.h(af4Var, "$detector");
        return af4Var.a(motionEvent);
    }
}
