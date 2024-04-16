package im.threads.ui.fragments;

import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.models.FileDescription;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", Image.TYPE_SMALL, "Lrb7;", "Lim/threads/business/models/FileDescription;", "fileDescriptionOptional", "", "invoke", "(Ljava/lang/String;Lrb7;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1 extends ej5 implements Function2<String, rb7<FileDescription>, Boolean> {
    public static final ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1 INSTANCE = new ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1();

    ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r8.subSequence(r3, r0 + 1).toString().length() == 0) goto L33;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.String r8, defpackage.rb7<im.threads.business.models.FileDescription> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "s"
            defpackage.z65.h(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L48
            int r0 = r8.length()
            int r0 = r0 - r2
            r3 = 0
            r4 = 0
        L14:
            if (r3 > r0) goto L39
            if (r4 != 0) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r0
        L1b:
            char r5 = r8.charAt(r5)
            r6 = 32
            int r5 = defpackage.z65.j(r5, r6)
            if (r5 > 0) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            if (r4 != 0) goto L33
            if (r5 != 0) goto L30
            r4 = 1
            goto L14
        L30:
            int r3 = r3 + 1
            goto L14
        L33:
            if (r5 != 0) goto L36
            goto L39
        L36:
            int r0 = r0 + (-1)
            goto L14
        L39:
            int r0 = r0 + r2
            java.lang.CharSequence r8 = r8.subSequence(r3, r0)
            java.lang.String r8 = r8.toString()
            int r8 = r8.length()
            if (r8 != 0) goto L51
        L48:
            if (r9 == 0) goto L50
            boolean r8 = r9.c()
            if (r8 == 0) goto L51
        L50:
            r1 = 1
        L51:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.ui.fragments.ChatFragment$configureRecordButtonVisibility$recordButtonVisibilityDisposable$1.invoke(java.lang.String, rb7):java.lang.Boolean");
    }
}
