package defpackage;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SingleOnClickListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lnma;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", DateTokenConverter.CONVERTER_KEY, "", "a", "Z", "singleClickFlag", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "singleClickRunnable", "<init>", "()V", c.a, "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nma  reason: default package */
/* loaded from: classes.dex */
public abstract class nma implements View.OnClickListener {
    public static final a c = new a(null);
    private static boolean d = true;
    private static final Runnable e = new Runnable() { // from class: lma
        @Override // java.lang.Runnable
        public final void run() {
            nma.c();
        }
    };
    private boolean a = true;
    private final Runnable b = new Runnable() { // from class: mma
        @Override // java.lang.Runnable
        public final void run() {
            nma.e(nma.this);
        }
    };

    /* compiled from: SingleOnClickListener.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lnma$a;", "", "Ljava/lang/Runnable;", "ENABLE_AGAIN", "Ljava/lang/Runnable;", "getENABLE_AGAIN$annotations", "()V", "", "MIN_CLICK_INTERVAL", "J", "<init>", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nma$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(nma nmaVar) {
        z65.h(nmaVar, "this$0");
        nmaVar.a = true;
    }

    public abstract void d(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        z65.h(view, "v");
        if (d && this.a) {
            d = false;
            this.a = false;
            view.post(e);
            d(view);
            view.postDelayed(this.b, 200L);
        }
    }
}
