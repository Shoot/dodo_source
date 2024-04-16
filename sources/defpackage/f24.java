package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: FocusOwner.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0018H&R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lf24;", "Lb24;", "", "b", "k", "", "force", "refreshFocusEvents", c.a, "Lk99;", "i", "Lbf5;", "keyEvent", "n", "(Landroid/view/KeyEvent;)Z", "f", "Lfo9;", "event", "l", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "g", "Lu14;", DateTokenConverter.CONVERTER_KEY, "Lg24;", "j", "Lsm6;", Image.TYPE_HIGH, "()Lsm6;", "modifier", "Lqm5;", "getLayoutDirection", "()Lqm5;", "a", "(Lqm5;)V", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: f24  reason: default package */
/* loaded from: classes.dex */
public interface f24 extends b24 {
    void a(qm5 qm5Var);

    void b();

    void c(boolean z, boolean z2);

    void d(u14 u14Var);

    boolean f(KeyEvent keyEvent);

    void g(FocusTargetNode focusTargetNode);

    sm6 h();

    k99 i();

    void j(g24 g24Var);

    void k();

    boolean l(fo9 fo9Var);

    boolean n(KeyEvent keyEvent);
}
