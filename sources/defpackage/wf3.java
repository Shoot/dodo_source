package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
/* compiled from: EmojiTextViewHelper.java */
/* renamed from: wf3  reason: default package */
/* loaded from: classes.dex */
public final class wf3 {
    private final b a;

    /* compiled from: EmojiTextViewHelper.java */
    /* renamed from: wf3$a */
    /* loaded from: classes.dex */
    private static class a extends b {
        private final TextView a;
        private final sf3 b;
        private boolean c = true;

        a(TextView textView) {
            this.a = textView;
            this.b = new sf3(textView);
        }

        @NonNull
        private InputFilter[] f(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof sf3) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        private InputFilter[] h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g = g(inputFilterArr);
            if (g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof yf3) {
                return ((yf3) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void k() {
            this.a.setFilters(a(this.a.getFilters()));
        }

        @NonNull
        private TransformationMethod m(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof yf3) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new yf3(transformationMethod);
        }

        @Override // defpackage.wf3.b
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            if (!this.c) {
                return h(inputFilterArr);
            }
            return f(inputFilterArr);
        }

        @Override // defpackage.wf3.b
        public boolean b() {
            return this.c;
        }

        @Override // defpackage.wf3.b
        void c(boolean z) {
            if (z) {
                l();
            }
        }

        @Override // defpackage.wf3.b
        void d(boolean z) {
            this.c = z;
            l();
            k();
        }

        @Override // defpackage.wf3.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (this.c) {
                return m(transformationMethod);
            }
            return j(transformationMethod);
        }

        void i(boolean z) {
            this.c = z;
        }

        void l() {
            this.a.setTransformationMethod(e(this.a.getTransformationMethod()));
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* renamed from: wf3$b */
    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z) {
            throw null;
        }

        void d(boolean z) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    /* renamed from: wf3$c */
    /* loaded from: classes.dex */
    private static class c extends b {
        private final a a;

        c(TextView textView) {
            this.a = new a(textView);
        }

        private boolean f() {
            return !e.h();
        }

        @Override // defpackage.wf3.b
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            if (f()) {
                return inputFilterArr;
            }
            return this.a.a(inputFilterArr);
        }

        @Override // defpackage.wf3.b
        public boolean b() {
            return this.a.b();
        }

        @Override // defpackage.wf3.b
        void c(boolean z) {
            if (f()) {
                return;
            }
            this.a.c(z);
        }

        @Override // defpackage.wf3.b
        void d(boolean z) {
            if (f()) {
                this.a.i(z);
            } else {
                this.a.d(z);
            }
        }

        @Override // defpackage.wf3.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (f()) {
                return transformationMethod;
            }
            return this.a.e(transformationMethod);
        }
    }

    public wf3(@NonNull TextView textView, boolean z) {
        kh8.g(textView, "textView cannot be null");
        if (!z) {
            this.a = new c(textView);
        } else {
            this.a = new a(textView);
        }
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.a.a(inputFilterArr);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.a.e(transformationMethod);
    }
}
