package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: EnterPhoneTextWatcher.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0004\b$\u0010%J*\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J*\u0010\n\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\"\u0010#\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lvi3;", "Landroid/text/TextWatcher;", "", "char", "", "start", "count", "after", "", "beforeTextChanged", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnPhoneInputChanged", "()Lkotlin/jvm/functions/Function0;", "onPhoneInputChanged", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "getOnEnterManyChars", "()Lkotlin/jvm/functions/Function1;", "onEnterManyChars", c.a, "getOnEnterOneChar", "onEnterOneChar", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getPreviousText", "()Ljava/lang/String;", "setPreviousText", "(Ljava/lang/String;)V", "previousText", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vi3  reason: default package */
/* loaded from: classes4.dex */
public final class vi3 implements TextWatcher {
    private final Function0<Unit> a;
    private final Function1<String, Unit> b;
    private final Function1<String, Unit> c;
    private String d;

    /* JADX WARN: Multi-variable type inference failed */
    public vi3(Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        z65.h(function0, "onPhoneInputChanged");
        z65.h(function1, "onEnterManyChars");
        z65.h(function12, "onEnterOneChar");
        this.a = function0;
        this.b = function1;
        this.c = function12;
        this.d = "";
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String obj;
        if (editable != null && (obj = editable.toString()) != null) {
            this.a.invoke();
            if (this.d.length() == 0 && obj.length() > 1) {
                this.b.invoke(obj);
            } else {
                this.c.invoke(obj);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = (charSequence == null || (r1 = charSequence.toString()) == null) ? "" : "";
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
