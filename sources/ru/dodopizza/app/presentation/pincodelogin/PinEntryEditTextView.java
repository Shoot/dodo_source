package ru.dodopizza.app.presentation.pincodelogin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import ru.dodopizza.app.presentation.pincodelogin.PinEntryEditTextView;
/* compiled from: PinEntryEditTextView.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u00020\u0001:\u0004\u0019\u001c\u001e B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0016\u0010$\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010)R$\u0010/\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010,\"\u0004\b-\u0010.R$\u00102\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "j", Image.TYPE_MEDIUM, "", "i", "l", "", "getPin", Image.TYPE_HIGH, "f", "", "isBlockMode", "g", "Landroid/graphics/Canvas;", "canvas", "onDraw", "pinCode", "setPin", "", "a", "I", "digitWidth", "b", "digitHeight", com.huawei.hms.opendevice.c.a, "digitExtraSpace", DateTokenConverter.CONVERTER_KEY, "digitNumber", e.a, "emptySignWidth", "emptySignHeight", "alertColor", "[C", "chars", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "emptySignDrawable", "value", "Z", "setAlerted", "(Z)V", "isAlerted", "k", "setBlocked", "isBlocked", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;", "getOnPinEnteredListener", "()Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;", "setOnPinEnteredListener", "(Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;)V", "onPinEnteredListener", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;", "Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;", "getOnPinAlertChangedListener", "()Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;", "setOnPinAlertChangedListener", "(Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;)V", "onPinAlertChangedListener", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "n", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinEntryEditTextView extends AppCompatEditText {
    public static final a n = new a(null);
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private char[] h;
    private Drawable i;
    private boolean j;
    private boolean k;
    private c l;
    private b m;

    /* compiled from: PinEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$a;", "", "", "EMPTY_SIGN", "C", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PinEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$b;", "", "", "isAlerted", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: PinEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$c;", "", "", "pin", "", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public interface c {
        void a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinEntryEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(attributeSet, "attributeSet");
        this.d = 1;
        this.g = iu1.c(getContext(), R.color.textIconWarningColor);
        this.h = i();
        j(context, attributeSet);
    }

    private final String getPin() {
        String N;
        N = yr.N(this.h, "", null, null, 0, null, null, 62, null);
        return N;
    }

    private final char[] i() {
        int i = this.d;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '*';
        }
        return cArr;
    }

    private final void j(Context context, AttributeSet attributeSet) {
        m(context, attributeSet);
        setPadding(0, 0, 0, 0);
        addTextChangedListener(new d());
        setOnClickListener(new View.OnClickListener() { // from class: t68
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinEntryEditTextView.k(PinEntryEditTextView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PinEntryEditTextView pinEntryEditTextView, View view) {
        int H;
        int h;
        z65.h(pinEntryEditTextView, "this$0");
        gg5.d(pinEntryEditTextView);
        H = yr.H(pinEntryEditTextView.h, '*');
        Integer valueOf = Integer.valueOf(H);
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        h = i.h(((Number) mh5.c(valueOf, Integer.valueOf(pinEntryEditTextView.d))).intValue(), pinEntryEditTextView.length());
        pinEntryEditTextView.setSelection(h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        int P;
        c cVar;
        int H;
        if (this.j) {
            H = yr.H(this.h, '*');
            if (H != 0) {
                setAlerted(false);
            }
        }
        invalidate();
        P = yr.P(this.h, '*');
        if (P == -1 && (cVar = this.l) != null) {
            cVar.a(getPin());
        }
    }

    private final void m(Context context, AttributeSet attributeSet) {
        Object[] w;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d29.L1, 0, 0);
        z65.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.d = obtainStyledAttributes.getInt(3, 1);
            InputFilter[] filters = getFilters();
            z65.g(filters, "getFilters(...)");
            w = xr.w(filters, new InputFilter.LengthFilter(this.d));
            setFilters((InputFilter[]) w);
            this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.e = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            setBackground(iu1.e(context, 17170445));
            this.g = obtainStyledAttributes.getColor(0, iu1.c(context, R.color.textIconWarningColor));
            this.h = i();
            Drawable f = ek9.f(getResources(), R.drawable.ic_empty_pin_circle, null);
            if (f != null) {
                this.i = f;
                int i = this.a;
                int i2 = this.d;
                setWidth((i * i2) + ((i2 - 1) * this.c));
                setHeight(this.b);
                getPaint().setTextAlign(Paint.Align.CENTER);
                return;
            }
            throw new IllegalArgumentException("Wrong drawable resource!");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setAlerted(boolean z) {
        this.j = z;
        b bVar = this.m;
        if (bVar != null) {
            bVar.a(z);
        }
    }

    private final void setBlocked(boolean z) {
        this.k = z;
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

    public final b getOnPinAlertChangedListener() {
        return this.m;
    }

    public final c getOnPinEnteredListener() {
        return this.l;
    }

    public final void h() {
        this.h = i();
        setText("");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        z65.h(canvas, "canvas");
        if (this.j) {
            getPaint().setColor(this.g);
        } else {
            getPaint().setColor(getCurrentTextColor());
        }
        int paddingLeft = getPaddingLeft() + (this.a / 2);
        float height = (getHeight() / 2) - ((getPaint().ascent() + getPaint().descent()) / 2);
        int length = this.h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 > 0) {
                i = this.a + this.c;
            } else {
                i = 0;
            }
            paddingLeft += i;
            char c2 = this.h[i2];
            if (c2 != '*') {
                canvas.drawText(String.valueOf(c2), paddingLeft, height, getPaint());
            } else {
                int i3 = this.e;
                int i4 = paddingLeft - (i3 / 2);
                int i5 = (i3 / 2) + paddingLeft;
                int height2 = (getHeight() / 2) - (this.f / 2);
                int height3 = (getHeight() / 2) + (this.f / 2);
                Drawable drawable = this.i;
                Drawable drawable2 = null;
                if (drawable == null) {
                    z65.z("emptySignDrawable");
                    drawable = null;
                }
                drawable.setBounds(i4, height2, i5, height3);
                Drawable drawable3 = this.i;
                if (drawable3 == null) {
                    z65.z("emptySignDrawable");
                } else {
                    drawable2 = drawable3;
                }
                drawable2.draw(canvas);
            }
        }
    }

    public final void setOnPinAlertChangedListener(b bVar) {
        this.m = bVar;
    }

    public final void setOnPinEnteredListener(c cVar) {
        this.l = cVar;
    }

    public final void setPin(String str) {
        z65.h(str, "pinCode");
        if (str.length() == this.d) {
            char[] cArr = this.h;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                char c2 = cArr[i];
                this.h[i2] = str.charAt(i2);
                i++;
                i2++;
            }
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PinEntryEditTextView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView$d;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "<init>", "(Lru/dodopizza/app/presentation/pincodelogin/PinEntryEditTextView;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Character W0;
            char c;
            if (!PinEntryEditTextView.this.k) {
                String str = (editable == null || (str = editable.toString()) == null) ? "" : "";
                int i = PinEntryEditTextView.this.d;
                for (int i2 = 0; i2 < i; i2++) {
                    char[] cArr = PinEntryEditTextView.this.h;
                    W0 = o0b.W0(str, i2);
                    if (W0 != null) {
                        c = W0.charValue();
                    } else {
                        c = '*';
                    }
                    cArr[i2] = c;
                }
                PinEntryEditTextView.this.l();
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
