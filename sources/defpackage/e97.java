package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: OnTextChanged.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "", "", "action", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: e97  reason: default package */
/* loaded from: classes.dex */
public final class e97 {

    /* compiled from: OnTextChanged.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"e97$a", "Landroid/text/TextWatcher;", "", "charSequence", "", "i", "i1", "i2", "", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e97$a */
    /* loaded from: classes.dex */
    public static final class a implements TextWatcher {
        final /* synthetic */ Function1<String, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super String, Unit> function1) {
            this.a = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            z65.h(editable, "editable");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            z65.h(charSequence, "charSequence");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            z65.h(charSequence, "charSequence");
            this.a.invoke(charSequence.toString());
        }
    }

    public static final void a(TextView textView, Function1<? super String, Unit> function1) {
        z65.h(textView, "<this>");
        z65.h(function1, "action");
        textView.addTextChangedListener(new a(function1));
    }
}
