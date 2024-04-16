package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
final class q {
    @NonNull
    private TextView a;
    private TextClassifier b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* loaded from: classes.dex */
    private static final class a {
        @NonNull
        static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(@NonNull TextView textView) {
        this.a = (TextView) kh8.f(textView);
    }

    @NonNull
    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier == null) {
            return a.a(this.a);
        }
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
