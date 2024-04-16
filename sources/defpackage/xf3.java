package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: EmojiTextWatcher.java */
/* renamed from: xf3  reason: default package */
/* loaded from: classes.dex */
final class xf3 implements TextWatcher {
    private final EditText a;
    private final boolean b;
    private e.AbstractC0033e c;
    private int d = Integer.MAX_VALUE;
    private int e = 0;
    private boolean f = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiTextWatcher.java */
    /* renamed from: xf3$a */
    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0033e {
        private final Reference<EditText> a;

        a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            super.b();
            xf3.e(this.a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public xf3(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    private e.AbstractC0033e c() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    static void e(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.b().o(editableText);
            sf3.d(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean g() {
        if (this.f && (this.b || e.h())) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return this.f;
    }

    public void f(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                e.b().t(this.c);
            }
            this.f = z;
            if (z) {
                e(this.a, e.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.a.isInEditMode() && !g() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = e.b().d();
            if (d != 0) {
                if (d != 1) {
                    if (d != 3) {
                        return;
                    }
                } else {
                    e.b().r((Spannable) charSequence, i, i + i3, this.d, this.e);
                    return;
                }
            }
            e.b().s(c());
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
