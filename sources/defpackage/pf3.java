package defpackage;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
/* compiled from: EmojiEditTextHelper.java */
/* renamed from: pf3  reason: default package */
/* loaded from: classes.dex */
public final class pf3 {
    private final b a;
    private int b = Integer.MAX_VALUE;
    private int c = 0;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: pf3$a */
    /* loaded from: classes.dex */
    private static class a extends b {
        private final EditText a;
        private final xf3 b;

        a(@NonNull EditText editText, boolean z) {
            this.a = editText;
            xf3 xf3Var = new xf3(editText, z);
            this.b = xf3Var;
            editText.addTextChangedListener(xf3Var);
            editText.setEditableFactory(qf3.getInstance());
        }

        @Override // defpackage.pf3.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof tf3) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new tf3(keyListener);
        }

        @Override // defpackage.pf3.b
        boolean b() {
            return this.b.d();
        }

        @Override // defpackage.pf3.b
        InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            if (inputConnection instanceof rf3) {
                return inputConnection;
            }
            return new rf3(this.a, inputConnection, editorInfo);
        }

        @Override // defpackage.pf3.b
        void d(boolean z) {
            this.b.f(z);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: pf3$b */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        KeyListener a(KeyListener keyListener) {
            throw null;
        }

        boolean b() {
            throw null;
        }

        InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            throw null;
        }

        void d(boolean z) {
            throw null;
        }
    }

    public pf3(@NonNull EditText editText, boolean z) {
        kh8.g(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public boolean b() {
        return this.a.b();
    }

    public InputConnection c(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.c(inputConnection, editorInfo);
    }

    public void d(boolean z) {
        this.a.d(z);
    }
}
