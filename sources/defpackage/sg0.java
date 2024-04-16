package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BubbleMessageView.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u0001;B\u0011\b\u0016\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bJ\u0014\u0010\"\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0012J\u0014\u0010'\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040%J\u0014\u0010)\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%J\b\u0010*\u001a\u00020\u0004H\u0002J\b\u0010+\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010/\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u00100\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u00102\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u00103\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J0\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0002R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010DR\u0016\u0010G\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010@R\u0016\u0010I\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010HR\u001c\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b.\u0010J\u0012\u0004\bK\u0010LR&\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020 0Nj\b\u0012\u0004\u0012\u00020 `O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010PR\u0016\u0010S\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010RR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010T¨\u0006Y"}, d2 = {"Lsg0;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "title", "setTitle", "subtitle", "setSubtitle", "", "gravity", "setTitleGravity", "setSubtitleGravity", "Landroid/graphics/drawable/Drawable;", ElementGenerator.TYPE_IMAGE, "setImageDrawable", "", "isVisible", "setCloseActionImageVisibility", "Landroid/graphics/RectF;", "targetViewLocationOnScreen", "setTargetViewScreenLocation", "backgroundColor", "setBackgroundColour", "textColor", "setTextColor", "textSize", "setTitleTextSize", "setSubtitleTextSize", "", "Lwg0$a;", "arrowPosition", "setArrowPosition", "needShowArrow", "j", "Lkotlin/Function0;", "onClickListener", "setOnBubbleClick", "onCloseClickListener", "setOnCloseActionImageClick", "i", "o", e.a, DateTokenConverter.CONVERTER_KEY, "g", Image.TYPE_HIGH, Image.TYPE_MEDIUM, "l", "k", "n", "Landroid/graphics/Paint;", "paint", "x", "y", "width", "f", "Landroid/view/View;", "a", "Landroid/view/View;", "itemView", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "imageViewIcon", "Landroid/widget/TextView;", c.a, "Landroid/widget/TextView;", "textViewTitle", "textViewSubtitle", "imageViewClose", "Landroid/graphics/RectF;", "targetViewScreenLocation", "I", "getMBackgroundColor$annotations", "()V", "mBackgroundColor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "arrowPositionList", "Z", "arrowShow", "Landroid/graphics/Paint;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sg0  reason: default package */
/* loaded from: classes.dex */
public final class sg0 extends ConstraintLayout {
    public static final a k = new a(null);
    private static final int l;
    private static final int m;
    private View a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private ImageView e;
    private RectF f;
    private int g;
    private ArrayList<wg0.a> h;
    private boolean i;
    private final Paint j;

    /* compiled from: BubbleMessageView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lsg0$a;", "", "", "DEFAULT_MARGIN", "I", "SAVE_ARROW_MARGIN", "WIDTH_ARROW", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sg0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BubbleMessageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sg0$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[wg0.a.values().length];
            try {
                iArr[wg0.a.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wg0.a.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wg0.a.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wg0.a.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        jx9 jx9Var = jx9.a;
        int a2 = jx9Var.a(16);
        l = a2;
        m = a2 + jx9Var.a(13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f = new RectF();
        this.g = iu1.c(getContext(), jw8.surfaceTooltipsColor);
        this.h = new ArrayList<>();
        this.j = new Paint(1);
        i();
    }

    private final void d(Canvas canvas, wg0.a aVar, RectF rectF) {
        int i;
        int height;
        int i2 = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (!rectF.isEmpty()) {
                            i = g(rectF);
                        } else {
                            i = getWidth() / 2;
                        }
                        height = getHeight() - l;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!rectF.isEmpty()) {
                        i = g(rectF);
                    } else {
                        i = getWidth() / 2;
                    }
                    height = l;
                }
            } else {
                i = getWidth() - l;
                if (!rectF.isEmpty()) {
                    height = h(rectF);
                } else {
                    height = getHeight() / 2;
                }
            }
        } else {
            i = l;
            if (!rectF.isEmpty()) {
                height = h(rectF);
            } else {
                height = getHeight() / 2;
            }
        }
        f(canvas, this.j, i, height, jx9.a.a(20));
    }

    private final void e(Canvas canvas) {
        int i = l;
        canvas.drawRoundRect(new RectF(i, i, getWidth() - i, getHeight() - i), 12.0f, 12.0f, this.j);
    }

    private final void f(Canvas canvas, Paint paint, int i, int i2, int i3) {
        int i4;
        Path path = new Path();
        float f = i;
        float f2 = i2 + (i3 / 2);
        path.moveTo(f, f2);
        float f3 = i2;
        path.lineTo(i - i4, f3);
        path.lineTo(f, i2 - i4);
        path.lineTo(i + i4, f3);
        path.lineTo(f, f2);
        path.close();
        canvas.drawPath(path, paint);
    }

    private final int g(RectF rectF) {
        if (m(rectF)) {
            return getWidth() - m;
        }
        if (l(rectF)) {
            return m;
        }
        return Math.round(rectF.centerX() - jx9.a.b(this));
    }

    private final int h(RectF rectF) {
        if (k(rectF)) {
            return getHeight() - m;
        }
        if (n(rectF)) {
            return m;
        }
        float centerY = rectF.centerY();
        jx9 jx9Var = jx9.a;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        return Math.round((centerY + jx9Var.f(context)) - jx9Var.c(this));
    }

    private final void i() {
        setWillNotDraw(false);
        View inflate = View.inflate(getContext(), sz8.view_bubble_message, this);
        z65.g(inflate, "inflate(...)");
        this.a = inflate;
        View findViewById = findViewById(vx8.imageViewShowCase);
        z65.g(findViewById, "findViewById(...)");
        this.b = (ImageView) findViewById;
        View findViewById2 = findViewById(vx8.imageViewShowCaseClose);
        z65.g(findViewById2, "findViewById(...)");
        this.e = (ImageView) findViewById2;
        View findViewById3 = findViewById(vx8.textViewShowCaseTitle);
        z65.g(findViewById3, "findViewById(...)");
        this.c = (TextView) findViewById3;
        View findViewById4 = findViewById(vx8.textViewShowCaseText);
        z65.g(findViewById4, "findViewById(...)");
        this.d = (TextView) findViewById4;
    }

    private final boolean k(RectF rectF) {
        float centerY = rectF.centerY();
        jx9 jx9Var = jx9.a;
        int c = (jx9Var.c(this) + getHeight()) - m;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        if (centerY > c - jx9Var.f(context)) {
            return true;
        }
        return false;
    }

    private final boolean l(RectF rectF) {
        if (rectF.centerX() < jx9.a.b(this) + m) {
            return true;
        }
        return false;
    }

    private final boolean m(RectF rectF) {
        if (rectF.centerX() > (jx9.a.b(this) + getWidth()) - m) {
            return true;
        }
        return false;
    }

    private final boolean n(RectF rectF) {
        float centerY = rectF.centerY();
        jx9 jx9Var = jx9.a;
        int c = jx9Var.c(this) + m;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        if (centerY < c - jx9Var.f(context)) {
            return true;
        }
        return false;
    }

    private final void o() {
        this.j.setColor(this.g);
        this.j.setStyle(Paint.Style.FILL);
        this.j.setStrokeWidth(4.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function0 function0, View view) {
        z65.h(function0, "$onClickListener");
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function0 function0, View view) {
        z65.h(function0, "$onCloseClickListener");
        function0.invoke();
    }

    public final void j(boolean z) {
        this.i = z;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
        super.onDraw(canvas);
        o();
        e(canvas);
        if (this.i) {
            Iterator<wg0.a> it = this.h.iterator();
            while (it.hasNext()) {
                wg0.a next = it.next();
                z65.e(next);
                d(canvas, next, this.f);
            }
        }
    }

    public final void setArrowPosition(List<? extends wg0.a> list) {
        z65.h(list, "arrowPosition");
        this.h.clear();
        this.h.addAll(list);
    }

    public final void setBackgroundColour(int i) {
        this.g = i;
    }

    public final void setCloseActionImageVisibility(boolean z) {
        ImageView imageView = null;
        if (z) {
            ImageView imageView2 = this.e;
            if (imageView2 == null) {
                z65.z("imageViewClose");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView3 = this.e;
        if (imageView3 == null) {
            z65.z("imageViewClose");
        } else {
            imageView = imageView3;
        }
        imageView.setVisibility(4);
    }

    public final void setImageDrawable(Drawable drawable) {
        z65.h(drawable, ElementGenerator.TYPE_IMAGE);
        ImageView imageView = this.b;
        ImageView imageView2 = null;
        if (imageView == null) {
            z65.z("imageViewIcon");
            imageView = null;
        }
        imageView.setVisibility(0);
        ImageView imageView3 = this.b;
        if (imageView3 == null) {
            z65.z("imageViewIcon");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setImageDrawable(drawable);
    }

    public final void setOnBubbleClick(final Function0<Unit> function0) {
        z65.h(function0, "onClickListener");
        View view = this.a;
        if (view == null) {
            z65.z("itemView");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: qg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                sg0.p(Function0.this, view2);
            }
        });
    }

    public final void setOnCloseActionImageClick(final Function0<Unit> function0) {
        z65.h(function0, "onCloseClickListener");
        ImageView imageView = this.e;
        if (imageView == null) {
            z65.z("imageViewClose");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: rg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sg0.q(Function0.this, view);
            }
        });
    }

    public final void setSubtitle(String str) {
        z65.h(str, "subtitle");
        TextView textView = this.d;
        TextView textView2 = null;
        if (textView == null) {
            z65.z("textViewSubtitle");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.d;
        if (textView3 == null) {
            z65.z("textViewSubtitle");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str);
    }

    public final void setSubtitleGravity(int i) {
        TextView textView = this.d;
        if (textView == null) {
            z65.z("textViewSubtitle");
            textView = null;
        }
        textView.setGravity(i);
    }

    public final void setSubtitleTextSize(int i) {
        TextView textView = this.d;
        if (textView == null) {
            z65.z("textViewSubtitle");
            textView = null;
        }
        textView.setTextSize(2, i);
    }

    public final void setTargetViewScreenLocation(RectF rectF) {
        z65.h(rectF, "targetViewLocationOnScreen");
        this.f = rectF;
    }

    public final void setTextColor(int i) {
        TextView textView = this.c;
        TextView textView2 = null;
        if (textView == null) {
            z65.z("textViewTitle");
            textView = null;
        }
        textView.setTextColor(i);
        TextView textView3 = this.d;
        if (textView3 == null) {
            z65.z("textViewSubtitle");
        } else {
            textView2 = textView3;
        }
        textView2.setTextColor(i);
    }

    public final void setTitle(String str) {
        z65.h(str, "title");
        TextView textView = this.c;
        TextView textView2 = null;
        if (textView == null) {
            z65.z("textViewTitle");
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView3 = this.c;
        if (textView3 == null) {
            z65.z("textViewTitle");
        } else {
            textView2 = textView3;
        }
        textView2.setText(str);
    }

    public final void setTitleGravity(int i) {
        TextView textView = this.c;
        if (textView == null) {
            z65.z("textViewTitle");
            textView = null;
        }
        textView.setGravity(i);
    }

    public final void setTitleTextSize(int i) {
        TextView textView = this.c;
        if (textView == null) {
            z65.z("textViewTitle");
            textView = null;
        }
        textView.setTextSize(2, i);
    }

    private static /* synthetic */ void getMBackgroundColor$annotations() {
    }
}
