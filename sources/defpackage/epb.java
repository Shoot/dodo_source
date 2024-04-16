package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: TypographyFragment.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0001TB\u0007¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0006H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0007H\u0002J\f\u0010\f\u001a\u00020\t*\u00020\u000bH\u0002J\f\u0010\r\u001a\u00020\u000b*\u00020\u0007H\u0002J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\u0018\u001a\u00020\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0016R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010-R\u001b\u00104\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010-R\u001b\u00107\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u0010-R\u001b\u0010:\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010-R\u001b\u0010=\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001c\u001a\u0004\b<\u0010-R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001c\u001a\u0004\bD\u0010AR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lepb;", "Lf70;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "", "sh", "Jh", "Landroid/text/Editable;", "", "Ih", "", "Fh", "", "Gh", "Hh", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Landroid/widget/AdapterView;", "parent", "position", "", "id", "onItemSelected", "onNothingSelected", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Ch", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/google/android/material/textview/MaterialTextView;", DateTokenConverter.CONVERTER_KEY, "zh", "()Lcom/google/android/material/textview/MaterialTextView;", "testText", "Landroid/widget/Spinner;", e.a, "Dh", "()Landroid/widget/Spinner;", "variantSpinner", "Lcom/google/android/material/textfield/TextInputEditText;", "f", "Ah", "()Lcom/google/android/material/textfield/TextInputEditText;", "textInput", "g", "Bh", "textSizeInput", Image.TYPE_HIGH, "wh", "letterSpacingInput", "i", "xh", "lineHeightInput", "j", "uh", "firstBaselineToTopHeightInput", "k", "vh", "lastBaselineToBottomHeightInput", "Landroid/widget/Button;", "l", "th", "()Landroid/widget/Button;", "applyButton", Image.TYPE_MEDIUM, "yh", "nextButton", "", "n", "Ljava/util/Map;", "textAppearance", "", "o", "Ljava/util/List;", "pangrams", "p", "Ljava/lang/String;", "currentTextAppearance", "<init>", "()V", "q", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"SetTextI18n"})
/* renamed from: epb  reason: default package */
/* loaded from: classes4.dex */
public final class epb extends f70 implements AdapterView.OnItemSelectedListener {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final Map<String, Integer> n;
    private final List<String> o;
    private String p;
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(epb.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(epb.class, "testText", "getTestText()Lcom/google/android/material/textview/MaterialTextView;", 0)), bc9.f(new ar8(epb.class, "variantSpinner", "getVariantSpinner()Landroid/widget/Spinner;", 0)), bc9.f(new ar8(epb.class, "textInput", "getTextInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "textSizeInput", "getTextSizeInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "letterSpacingInput", "getLetterSpacingInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "lineHeightInput", "getLineHeightInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "firstBaselineToTopHeightInput", "getFirstBaselineToTopHeightInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "lastBaselineToBottomHeightInput", "getLastBaselineToBottomHeightInput()Lcom/google/android/material/textfield/TextInputEditText;", 0)), bc9.f(new ar8(epb.class, "applyButton", "getApplyButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(epb.class, "nextButton", "getNextButton()Landroid/widget/Button;", 0))};
    public static final a q = new a(null);

    /* compiled from: TypographyFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lepb$a;", "", "Lepb;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: epb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final epb a() {
            return new epb();
        }
    }

    /* compiled from: TypographyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: epb$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            int indexOf = epb.this.o.indexOf(String.valueOf(epb.this.Ah().getText())) + 1;
            if (indexOf >= epb.this.o.size()) {
                indexOf = 0;
            }
            epb.this.Ah().setText((CharSequence) epb.this.o.get(indexOf));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TypographyFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: epb$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            epb.this.sh();
            epb.this.Jh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public epb() {
        super(R.layout.fragment_typography);
        Map<String, Integer> k;
        List<String> o;
        Object Y;
        this.c = kb0.e(this, R.id.typography_toolbar);
        this.d = kb0.e(this, R.id.typography_test_text);
        this.e = kb0.e(this, R.id.typography_text_appearance_spinner);
        this.f = kb0.e(this, R.id.typography_text_input);
        this.g = kb0.e(this, R.id.typography_textSize_edit);
        this.h = kb0.e(this, R.id.typography_letterSpacing_input);
        this.i = kb0.e(this, R.id.typography_lineHeight_input);
        this.j = kb0.e(this, R.id.typography_firstBaselineToTopHeight_input);
        this.k = kb0.e(this, R.id.typography_lastBaselineToBottomHeight_input);
        this.l = kb0.e(this, R.id.typography_apply_button);
        this.m = kb0.e(this, R.id.typography_next_text_button);
        k = g86.k(lnb.a("H Accent", 2131952221), lnb.a("H0", 2131952216), lnb.a("H1", Integer.valueOf((int) p19.TextAppearance_Dodo_Heading_H1)), lnb.a("H2", Integer.valueOf((int) s19.TextAppearance_Dodo_Heading_H2)), lnb.a("H3", Integer.valueOf((int) s19.TextAppearance_Dodo_Heading_H3)), lnb.a("H4", 2131952220), lnb.a("Text L Bold", 2131952224), lnb.a("Text L", 2131952223), lnb.a("Text M Bold", 2131952226), lnb.a("Text M", Integer.valueOf((int) p19.TextAppearance_Dodo_Text_M)), lnb.a("Text S Bold", 2131952228), lnb.a("Text S", 2131952227), lnb.a("Hint S", 2131952222), lnb.a("Button L", 2131952213), lnb.a("Button M", Integer.valueOf((int) s19.TextAppearance_Dodo_Button_M)), lnb.a("Button S", Integer.valueOf((int) s19.TextAppearance_Dodo_Button_S)));
        this.n = k;
        o = kc1.o("ara: أبجد هوز حطي كلمن سعفص قرشت ثخذ ضظغ", "aze: Zəfər, jaketini də papağını da götür, bu axşam hava çox soyuq olacaq.", "bel: Шэф звярнуўся да экіпажу: — Чым больш мы будзем браць удзел у гэтай вайне, тым больш у нас будзе шанцаў на перамогу.", "bul: Яздяха цигани на магаре на пътяща се кара.", "cat: El senyor de les bombolles de sabó va comprar un quilo de sabó en pols.", "ces: Příliš žluťoučký kůň úpěl ďábelské ódy.", "chi: 《桂林山水甲天下》", "dan: Quizdeltagerne spiste jordbær med fløde, mens cirkusklovnen Walther spillede på xylofon.", "deu: Zwölf Boxkämpfer jagen Viktor quer über den großen Sylter Deich.", "ell: Ταχίστη αλώπηξ βαφής ψημένη γη, δρασκελίζει υπέρ νωθρού κυνός.", "eng: Quick fox jumps nightly above wizard.", "est: Üle kuulsa jõe viib laulatuseni uus sild.", "fin: Yks' inkivääri, kaks' inkivääri, kolme inkivääriä, neljä inkivääriä, viis' inkivääriä.", "fra: Portez ce vieux whisky au juge blond qui fume.", "heb: זוהי שורה בעברית.", "hin: जांच के लिए एक बड़ा लोमड़ी निकला और जल्दी से भाग गया।", "ita: Franco vi aspetta per pranzo.", "jpn: いろはにほへとちりぬるをわかよたれそつねならむうゐのおくやまけふこえてあさきゆめみしゑひもせす", "kor: 가는 말이 고와야 오는 말이 곱다.", "por: Um pequeno jabuti xereta viu dez cegonhas felizes.", "rus: Шеф взъярён тчк щипцы с эхом гудбай Жюль.", "spa: El pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y frío, añoraba a su querido cachorro.", "tha: กวางตัวเล็ก ๆ นั่งอยู่บนหญ้าเขียว.", "tur: Pijamalı hasta yağız şoföre çabucak güvendi.", "ukr: Якщо хочеш знати, що буде потім, подивися, що було раніше.", "vie: Cô bé quàng khăn đỏ đang ngồi trên bãi cỏ xanh.");
        this.o = o;
        Y = sc1.Y(k.keySet());
        this.p = (String) Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextInputEditText Ah() {
        return (TextInputEditText) this.f.a(this, r[3]);
    }

    private final TextInputEditText Bh() {
        return (TextInputEditText) this.g.a(this, r[4]);
    }

    private final Toolbar Ch() {
        return (Toolbar) this.c.a(this, r[0]);
    }

    private final Spinner Dh() {
        return (Spinner) this.e.a(this, r[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(epb epbVar, View view) {
        z65.h(epbVar, "this$0");
        epbVar.requireActivity().onBackPressed();
    }

    private final String Fh(float f) {
        return String.valueOf(mpb.c(f, getContext()));
    }

    private final String Gh(int i) {
        return String.valueOf(mpb.c(i, getContext()));
    }

    private final int Hh(float f) {
        return mpb.e(f, getContext());
    }

    private final float Ih(Editable editable) {
        return Float.parseFloat(String.valueOf(editable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Jh() {
        Bh().setText(Fh(zh().getTextSize()));
        wh().setText(String.valueOf(zh().getLetterSpacing()));
        xh().setText(Gh(zh().getLineHeight()));
        if (Build.VERSION.SDK_INT >= 28) {
            uh().setText(Gh(zh().getFirstBaselineToTopHeight()));
            vh().setText(Gh(zh().getLastBaselineToBottomHeight()));
            return;
        }
        uh().setText("Support only on Android 9 or higher");
        uh().setEnabled(false);
        vh().setText("Support only on Android 9 or higher");
        vh().setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sh() {
        if (Build.VERSION.SDK_INT < 28) {
            Toast.makeText(getContext(), "Use android 9 or higher to edit font parameters", 1).show();
            return;
        }
        MaterialTextView zh = zh();
        zh.setTextSize(Ih(Bh().getText()));
        zh.setLetterSpacing(Ih(wh().getText()));
        zh.setLineHeight(Hh(Ih(xh().getText())));
        zh.setFirstBaselineToTopHeight(Hh(Ih(uh().getText())));
        zh.setLastBaselineToBottomHeight(Hh(Ih(vh().getText())));
    }

    private final Button th() {
        return (Button) this.l.a(this, r[9]);
    }

    private final TextInputEditText uh() {
        return (TextInputEditText) this.j.a(this, r[7]);
    }

    private final TextInputEditText vh() {
        return (TextInputEditText) this.k.a(this, r[8]);
    }

    private final TextInputEditText wh() {
        return (TextInputEditText) this.h.a(this, r[5]);
    }

    private final TextInputEditText xh() {
        return (TextInputEditText) this.i.a(this, r[6]);
    }

    private final Button yh() {
        return (Button) this.m.a(this, r[10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaterialTextView zh() {
        return (MaterialTextView) this.d.a(this, r[1]);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Object i2;
        z65.h(adapterView, "parent");
        Object itemAtPosition = adapterView.getItemAtPosition(i);
        z65.f(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
        String str = (String) itemAtPosition;
        this.p = str;
        i2 = g86.i(this.n, str);
        int intValue = ((Number) i2).intValue();
        if (Build.VERSION.SDK_INT >= 23) {
            zh().setTextAppearance(intValue);
        } else {
            Toast.makeText(requireContext(), "Use android 6 or higher to apply text appearance", 0).show();
        }
        Jh();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        List F0;
        int d0;
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ch().setNavigationOnClickListener(new View.OnClickListener() { // from class: dpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                epb.Eh(epb.this, view2);
            }
        });
        Ah().addTextChangedListener(new b());
        Ah().setText(R.string.lorem_ipsum);
        oma.a(yh(), new c());
        Spinner Dh = Dh();
        Context requireContext = requireContext();
        F0 = sc1.F0(this.n.keySet());
        Dh.setAdapter((SpinnerAdapter) new ArrayAdapter(requireContext, 17367043, F0));
        Dh().setOnItemSelectedListener(this);
        Spinner Dh2 = Dh();
        d0 = sc1.d0(this.n.keySet(), this.p);
        Dh2.setSelection(d0);
        oma.a(th(), new d());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* compiled from: TextView.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"epb$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: epb$b */
    /* loaded from: classes4.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            epb.this.zh().setText(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
