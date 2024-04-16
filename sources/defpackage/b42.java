package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomSpeedLinearSnapHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lb42;", "Landroidx/recyclerview/widget/k;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "b", "", "velocityX", "velocityY", "", "a", "", "f", "D", "horizontalSpeedMultiplier", "g", "verticalSpeedMultiplier", "Landroid/content/Context;", Image.TYPE_HIGH, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(DD)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b42  reason: default package */
/* loaded from: classes.dex */
public final class b42 extends k {
    private final double f;
    private final double g;
    private Context h;

    public /* synthetic */ b42(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? 1.0d : d2);
    }

    @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        Context context = this.h;
        if (context == null) {
            return false;
        }
        double scaledMaximumFlingVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        int i3 = (int) (this.f * scaledMaximumFlingVelocity);
        int i4 = (int) (scaledMaximumFlingVelocity * this.g);
        if (Math.abs(i) > i3) {
            i = ((int) Math.signum(i)) * i3;
        }
        if (Math.abs(i2) > i4) {
            i2 = ((int) Math.signum(i2)) * i4;
        }
        return super.a(i, i2);
    }

    @Override // androidx.recyclerview.widget.r
    public void b(RecyclerView recyclerView) {
        Context context;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        } else {
            context = null;
        }
        this.h = context;
        super.b(recyclerView);
    }

    public b42(double d, double d2) {
        this.f = d;
        this.g = d2;
    }
}
