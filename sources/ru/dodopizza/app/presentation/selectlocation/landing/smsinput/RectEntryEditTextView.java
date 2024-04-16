package ru.dodopizza.app.presentation.selectlocation.landing.smsinput;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.landing.smsinput.RectEntryEditTextView;
/* compiled from: RectEntryEditTextView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 I2\u00020\u0001:\u0004\u001e!#%B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bG\u0010HJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014R\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010.R$\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u00102\"\u0004\b3\u00104R$\u00108\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u00188\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b6\u00102\"\u0004\b7\u00104R$\u0010?\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010F\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "l", "o", "", "i", "n", "chars", "", "defValue", "k", "Landroid/graphics/Canvas;", "canvas", "start", "j", "", "getCode", "f", Image.TYPE_HIGH, "", "isBlockMode", "g", "onDraw", "pinCode", "setCode", "a", "I", "boxStrokeWidth", "b", "rectRadius", com.huawei.hms.opendevice.c.a, "rectWidth", DateTokenConverter.CONVERTER_KEY, "digitWidth", e.a, "digitHeight", "digitExtraSpace", "digitNumber", "alertColor", "[C", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "strokePaint", "backgroundPaint", "value", "Z", "setAlerted", "(Z)V", "isAlerted", Image.TYPE_MEDIUM, "setBlocked", "isBlocked", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;", "getOnCodeEnteredListener", "()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;", "setOnCodeEnteredListener", "(Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;)V", "onCodeEnteredListener", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;", "Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;", "getOnCodeAlertChangedListener", "()Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;", "setOnCodeAlertChangedListener", "(Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;)V", "onCodeAlertChangedListener", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RectEntryEditTextView extends AppCompatEditText {
    public static final b p = new b(null);
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private char[] i;
    private Paint j;
    private Paint k;
    private boolean l;
    private boolean m;
    private d n;
    private c o;

    /* compiled from: RectEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$b;", "", "", "EMPTY_SIGN", "C", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RectEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$c;", "", "", "isAlerted", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface c {
        void a(boolean z);
    }

    /* compiled from: RectEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$d;", "", "", "code", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectEntryEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attributeSet");
        this.g = 1;
        this.h = iu1.c(getContext(), R.color.textIconWarningColor);
        this.i = i();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.j = paint;
        l(context, attributeSet);
    }

    private final String getCode() {
        String N;
        N = yr.N(this.i, "", null, null, 0, null, null, 62, null);
        return N;
    }

    private final char[] i() {
        int i = this.g;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '*';
        }
        return cArr;
    }

    private final void j(Canvas canvas, int i) {
        int i2 = this.b;
        canvas.drawRoundRect(i, this.a / 2, i + this.c, getHeight() - (this.a / 2), i2, i2, this.j);
    }

    private final int k(char[] cArr, int i) {
        int H;
        int h;
        H = yr.H(cArr, '*');
        Integer valueOf = Integer.valueOf(H);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        h = i.h(((Number) mh5.c(valueOf, Integer.valueOf(i))).intValue(), length());
        return h;
    }

    private final void l(Context context, AttributeSet attributeSet) {
        o(context, attributeSet);
        setPadding(0, 0, 0, 0);
        addTextChangedListener(new a());
        setOnClickListener(new View.OnClickListener() { // from class: l99
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RectEntryEditTextView.m(RectEntryEditTextView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(RectEntryEditTextView rectEntryEditTextView, View view) {
        z65.h(rectEntryEditTextView, "this$0");
        gg5.d(rectEntryEditTextView);
        rectEntryEditTextView.setSelection(rectEntryEditTextView.k(rectEntryEditTextView.i, rectEntryEditTextView.g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        int P;
        d dVar;
        int H;
        if (this.l) {
            H = yr.H(this.i, '*');
            if (H != 0) {
                setAlerted(false);
            }
        }
        invalidate();
        P = yr.P(this.i, '*');
        if (P == -1 && (dVar = this.n) != null) {
            dVar.a(getCode());
        }
    }

    private final void o(Context context, AttributeSet attributeSet) {
        Object[] w;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d29.a2, 0, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.c = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            this.d = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.g = obtainStyledAttributes.getInt(4, 1);
            InputFilter[] filters = getFilters();
            z65.g(filters, "getFilters(...)");
            w = xr.w(filters, new InputFilter.LengthFilter(this.g));
            setFilters((InputFilter[]) w);
            this.f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            setBackground(ek9.f(getResources(), R.color.transparent, null));
            this.h = obtainStyledAttributes.getColor(1, iu1.c(context, R.color.textIconWarningColor));
            this.j.setStrokeWidth(this.a);
            this.j.setColor(obtainStyledAttributes.getColor(6, iu1.c(context, R.color.strokeDodoColor)));
            this.i = i();
            int i = this.c;
            int i2 = this.g;
            setWidth((i * i2) + (this.f * (i2 + 1)));
            setHeight(this.e);
            getPaint().setTextAlign(Paint.Align.CENTER);
            Paint paint = new Paint();
            paint.setColor(-1);
            this.k = paint;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setAlerted(boolean z) {
        this.l = z;
        c cVar = this.o;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    private final void setBlocked(boolean z) {
        this.m = z;
        setEnabled(!z);
        if (isEnabled()) {
            gg5.d(this);
        }
    }

    public final void f() {
        setAlerted(true);
        invalidate();
    }

    public final void g(boolean z) {
        setBlocked(z);
    }

    public final c getOnCodeAlertChangedListener() {
        return this.o;
    }

    public final d getOnCodeEnteredListener() {
        return this.n;
    }

    public final void h() {
        this.i = i();
        setText("");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        int i2;
        z65.h(canvas, "canvas");
        if (this.l) {
            getPaint().setColor(this.h);
        } else {
            getPaint().setColor(getCurrentTextColor());
        }
        int paddingLeft = getPaddingLeft() + this.f;
        int i3 = 2;
        int paddingLeft2 = getPaddingLeft() + this.f + (this.c / 2);
        float height = (getHeight() / 2) - ((getPaint().ascent() + getPaint().descent()) / 2);
        int k = k(this.i, 0);
        int length = this.i.length;
        int i4 = 0;
        while (i4 < length) {
            if (i4 > 0) {
                i = this.c + this.f;
            } else {
                i = 0;
            }
            int i5 = paddingLeft2 + i;
            if (i4 > 0) {
                i2 = this.c + this.f;
            } else {
                i2 = 0;
            }
            int i6 = paddingLeft + i2;
            float f = i6;
            float f2 = this.a / i3;
            float f3 = this.c + i6;
            float height2 = getHeight() - (this.a / i3);
            int i7 = this.b;
            float f4 = i7;
            float f5 = i7;
            Paint paint = this.k;
            if (paint == null) {
                z65.z("backgroundPaint");
                paint = null;
            }
            int i8 = length;
            canvas.drawRoundRect(f, f2, f3, height2, f4, f5, paint);
            if (i4 == k) {
                j(canvas, i6);
            }
            char c2 = this.i[i4];
            if (c2 != '*') {
                canvas.drawText(String.valueOf(c2), i5, height, getPaint());
            }
            i4++;
            paddingLeft = i6;
            paddingLeft2 = i5;
            length = i8;
            i3 = 2;
        }
    }

    public final void setCode(String str) {
        z65.h(str, "pinCode");
        if (str.length() == this.g) {
            char[] cArr = this.i;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char c2 = cArr[i];
                this.i[i2] = str.charAt(i2);
                i++;
                i2++;
            }
            n();
        }
    }

    public final void setOnCodeAlertChangedListener(c cVar) {
        this.o = cVar;
    }

    public final void setOnCodeEnteredListener(d dVar) {
        this.n = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RectEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView$a;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "<init>", "(Lru/dodopizza/app/presentation/selectlocation/landing/smsinput/RectEntryEditTextView;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Character W0;
            char c;
            if (!RectEntryEditTextView.this.m) {
                String str = (editable == null || (str = editable.toString()) == null) ? "" : "";
                int i = RectEntryEditTextView.this.g;
                for (int i2 = 0; i2 < i; i2++) {
                    char[] cArr = RectEntryEditTextView.this.i;
                    W0 = o0b.W0(str, i2);
                    if (W0 != null) {
                        c = W0.charValue();
                    } else {
                        c = '*';
                    }
                    cArr[i2] = c;
                }
                RectEntryEditTextView.this.n();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
