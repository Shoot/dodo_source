package defpackage;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: RadioButtonHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0010\u0014B\u0007¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lt39;", "", "", "viewId", "", "checked", "", "i", "id", Image.TYPE_HIGH, "Landroid/widget/RadioButton;", "radioButton", "f", "Lt39$b;", "listener", "j", "a", "I", "checkedId", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "b", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "childOnCheckedChangeListener", c.a, "Z", "mProtectFromCheckedChange", DateTokenConverter.CONVERTER_KEY, "Lt39$b;", "onCheckedChangeListener", "", e.a, "Ljava/util/Map;", "radioButtons", "g", "()I", "checkedRadioButtonId", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t39  reason: default package */
/* loaded from: classes.dex */
public final class t39 {
    private boolean c;
    private b d;
    private int a = -1;
    private final Map<Integer, RadioButton> e = new LinkedHashMap();
    private CompoundButton.OnCheckedChangeListener b = new a();

    /* compiled from: RadioButtonHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lt39$a;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "", "onCheckedChanged", "<init>", "(Lt39;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t39$a */
    /* loaded from: classes.dex */
    private final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            z65.h(compoundButton, "buttonView");
            if (!t39.this.c) {
                t39.this.c = true;
                if (t39.this.a != -1) {
                    t39 t39Var = t39.this;
                    t39Var.i(t39Var.a, false);
                }
                t39.this.c = false;
                t39.this.h(compoundButton.getId());
            }
        }
    }

    /* compiled from: RadioButtonHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lt39$b;", "", "", "checkedId", "", "a", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t39$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i) {
        this.a = i;
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i, boolean z) {
        RadioButton radioButton = this.e.get(Integer.valueOf(i));
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
    }

    public final void f(RadioButton radioButton) {
        z65.h(radioButton, "radioButton");
        radioButton.setOnCheckedChangeListener(this.b);
        this.e.put(Integer.valueOf(radioButton.getId()), radioButton);
        if (radioButton.isChecked()) {
            this.c = true;
            int i = this.a;
            if (i != -1) {
                i(i, false);
            }
            this.c = false;
            h(radioButton.getId());
        }
    }

    public final int g() {
        return this.a;
    }

    public final void j(b bVar) {
        this.d = bVar;
    }
}
