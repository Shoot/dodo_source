package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ApiBrokenDialog.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\n\u001a\u00020\b*\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u00062"}, d2 = {"Lem;", "Landroidx/fragment/app/c;", "Landroid/view/View;", "kh", "Landroid/text/SpannableStringBuilder;", "", "phone", "siteUrl", "", "jh", "qh", "nh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "phoneNumber", "mh", "ph", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "Landroid/widget/TextView;", c.a, "Landroid/widget/TextView;", "textView", DateTokenConverter.CONVERTER_KEY, "authErrorPhoneLabel", "Landroid/widget/Button;", e.a, "Landroid/widget/Button;", "closeButton", "f", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "g", "getSiteUrl", "setSiteUrl", "<init>", "()V", Image.TYPE_HIGH, "a", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: em  reason: default package */
/* loaded from: classes.dex */
public final class em extends androidx.fragment.app.c {
    public static final a h = new a(null);
    private final Logger b = LoggerFactory.getLogger("ApiBrokenDialog");
    private TextView c;
    private TextView d;
    private Button e;
    private String f;
    private String g;

    /* compiled from: ApiBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lem$a;", "", "Lem;", "a", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: em$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final em a() {
            return new em();
        }
    }

    /* compiled from: ApiBrokenDialog.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"em$b", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: em$b */
    /* loaded from: classes.dex */
    public static final class b extends ClickableSpan {
        final /* synthetic */ String a;
        final /* synthetic */ em b;

        b(String str, em emVar) {
            this.a = str;
            this.b = emVar;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            z65.h(view, "widget");
            String str = this.a;
            try {
                this.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception e) {
                Logger logger = this.b.b;
                logger.error("dodopizza url " + str, (Throwable) e);
            }
        }
    }

    private final void jh(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        String string;
        if (str != null && str.length() != 0) {
            int i = n09.api_broken_label_part2;
            Object[] objArr = new Object[1];
            if (str2 == null) {
                str2 = "";
            }
            objArr[0] = str2;
            string = getString(i, objArr);
        } else {
            int i2 = n09.api_broken_label_part2_no_phone;
            Object[] objArr2 = new Object[1];
            if (str2 == null) {
                str2 = "";
            }
            objArr2[0] = str2;
            string = getString(i2, objArr2);
        }
        z65.e(string);
        spannableStringBuilder.append((CharSequence) string);
    }

    private final View kh() {
        Button button = null;
        View inflate = requireActivity().getLayoutInflater().inflate(cz8.api_broken_dialog, (ViewGroup) null, true);
        View findViewById = inflate.findViewById(cy8.api_broken_message);
        z65.g(findViewById, "findViewById(...)");
        this.c = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(cy8.auth_error_phone);
        z65.g(findViewById2, "findViewById(...)");
        this.d = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(cy8.e);
        z65.g(findViewById3, "findViewById(...)");
        this.e = (Button) findViewById3;
        Drawable e = iu1.e(requireContext(), a09.disappointed);
        z65.e(e);
        e.setBounds(0, 0, mpb.a(20.0f, requireContext()), mpb.a(20.0f, requireContext()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = getString(n09.api_broken_label);
        z65.g(string, "getString(...)");
        spannableStringBuilder.append((CharSequence) string).append("[16842788]").setSpan(new ImageSpan(e), spannableStringBuilder.length() - 10, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("\n");
        jh(spannableStringBuilder, this.f, this.g);
        qh(spannableStringBuilder, this.g);
        TextView textView = this.c;
        if (textView == null) {
            z65.z("textView");
            textView = null;
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.c;
        if (textView2 == null) {
            z65.z("textView");
            textView2 = null;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        nh(this.f);
        Button button2 = this.e;
        if (button2 == null) {
            z65.z("closeButton");
        } else {
            button = button2;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: cm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                em.lh(em.this, view);
            }
        });
        z65.e(inflate);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lh(em emVar, View view) {
        z65.h(emVar, "this$0");
        emVar.dismiss();
    }

    private final void nh(final String str) {
        TextView textView = null;
        if (str == null) {
            TextView textView2 = this.d;
            if (textView2 == null) {
                z65.z("authErrorPhoneLabel");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            return;
        }
        TextView textView3 = this.d;
        if (textView3 == null) {
            z65.z("authErrorPhoneLabel");
            textView3 = null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.d;
        if (textView4 == null) {
            z65.z("authErrorPhoneLabel");
            textView4 = null;
        }
        textView4.setText(str);
        TextView textView5 = this.d;
        if (textView5 == null) {
            z65.z("authErrorPhoneLabel");
        } else {
            textView = textView5;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: dm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                em.oh(str, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(String str, em emVar, View view) {
        z65.h(emVar, "this$0");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + str));
        emVar.startActivity(intent);
    }

    private final void qh(SpannableStringBuilder spannableStringBuilder, String str) {
        int Z;
        if (str == null) {
            return;
        }
        b bVar = new b(str, this);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        z65.g(spannableStringBuilder2, "toString(...)");
        Z = m0b.Z(spannableStringBuilder2, str, 0, false, 6, null);
        spannableStringBuilder.setSpan(bVar, Z, str.length() + Z, 33);
    }

    public final em mh(String str) {
        this.f = str;
        return this;
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        androidx.appcompat.app.b a2 = new b.a(requireContext()).t(kh()).a();
        z65.g(a2, "create(...)");
        return a2;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        z65.h(dialogInterface, "dialog");
        d activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        super.onDismiss(dialogInterface);
    }

    public final em ph(String str) {
        this.g = str;
        return this;
    }
}
