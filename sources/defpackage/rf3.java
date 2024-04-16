package defpackage;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
/* compiled from: EmojiInputConnection.java */
/* renamed from: rf3  reason: default package */
/* loaded from: classes.dex */
final class rf3 extends InputConnectionWrapper {
    private final TextView a;
    private final a b;

    /* compiled from: EmojiInputConnection.java */
    /* renamed from: rf3$a */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@NonNull InputConnection inputConnection, @NonNull Editable editable, int i, int i2, boolean z) {
            return e.e(inputConnection, editable, i, i2, z);
        }

        public void b(@NonNull EditorInfo editorInfo) {
            if (e.h()) {
                e.b().u(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rf3(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (!this.b.a(this, a(), i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.b.a(this, a(), i, i2, true) && !super.deleteSurroundingTextInCodePoints(i, i2)) {
            return false;
        }
        return true;
    }

    rf3(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull a aVar) {
        super(inputConnection, false);
        this.a = textView;
        this.b = aVar;
        aVar.b(editorInfo);
    }
}
