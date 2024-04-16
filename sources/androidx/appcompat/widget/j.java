package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: classes.dex */
class j {
    @NonNull
    private final EditText a;
    @NonNull
    private final pf3 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(@NonNull EditText editText) {
        this.a = editText;
        this.b = new pf3(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.b.a(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, n29.i0, i, 0);
        try {
            int i2 = n29.w0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            f(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection e(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.b.c(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z) {
        this.b.d(z);
    }
}
