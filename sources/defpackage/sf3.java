package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* compiled from: EmojiInputFilter.java */
/* renamed from: sf3  reason: default package */
/* loaded from: classes.dex */
final class sf3 implements InputFilter {
    private final TextView a;
    private e.AbstractC0033e b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiInputFilter.java */
    /* renamed from: sf3$a */
    /* loaded from: classes.dex */
    public static class a extends e.AbstractC0033e {
        private final Reference<TextView> a;
        private final Reference<sf3> b;

        a(TextView textView, sf3 sf3Var) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(sf3Var);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0033e
        public void b() {
            CharSequence text;
            CharSequence o;
            super.b();
            TextView textView = this.a.get();
            if (!c(textView, this.b.get()) || !textView.isAttachedToWindow() || text == (o = e.b().o((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(o);
            int selectionEnd = Selection.getSelectionEnd(o);
            textView.setText(o);
            if (o instanceof Spannable) {
                sf3.d((Spannable) o, selectionStart, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public sf3(@NonNull TextView textView) {
        this.a = textView;
    }

    private e.AbstractC0033e c() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int d = e.b().d();
        if (d != 0) {
            if (d != 1) {
                if (d != 3) {
                    return charSequence;
                }
            } else if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != this.a.getText()) && charSequence != null) {
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return e.b().p(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        e.b().s(c());
        return charSequence;
    }
}
