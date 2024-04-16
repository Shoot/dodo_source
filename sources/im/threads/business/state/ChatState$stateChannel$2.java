package im.threads.business.state;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr6;", "Lim/threads/business/state/ChatStateEvent;", "invoke", "()Lfr6;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ChatState$stateChannel$2 extends ej5 implements Function0<fr6<ChatStateEvent>> {
    final /* synthetic */ ChatState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatState$stateChannel$2(ChatState chatState) {
        super(0);
        this.this$0 = chatState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if (defpackage.z65.c(r3, "null") != false) goto L27;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fr6<im.threads.business.state.ChatStateEvent> invoke() {
        /*
            r11 = this;
            java.lang.String r0 = "\""
            im.threads.business.state.ChatState r1 = r11.this$0
            im.threads.business.preferences.Preferences r1 = im.threads.business.state.ChatState.access$getPreferences$p(r1)
            im.threads.business.preferences.PreferencesCoreKeys r2 = im.threads.business.preferences.PreferencesCoreKeys.INSTANCE
            java.lang.String r2 = r2.getCHAT_STATE()
            im.threads.business.state.ChatStateEnum r3 = im.threads.business.state.ChatStateEnum.LOGGED_OUT
            im.threads.business.state.ChatState$stateChannel$2$invoke$$inlined$get$1 r4 = new im.threads.business.state.ChatState$stateChannel$2$invoke$$inlined$get$1
            r4.<init>()
            java.lang.reflect.Type r4 = r4.getType()
            java.lang.String r5 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r4, r5)
            r5 = 2
            r6 = 0
            r7 = 0
            im.threads.business.preferences.Preferences$Companion r8 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> L41
            java.lang.String r9 = r8.getPreferenceFromRam(r2)     // Catch: java.lang.Exception -> L41
            int r10 = r9.length()     // Catch: java.lang.Exception -> L41
            if (r10 != 0) goto L52
            boolean r10 = r8.isRamPreferencesLoaded()     // Catch: java.lang.Exception -> L41
            if (r10 != 0) goto L52
            android.content.SharedPreferences r1 = r1.getSharedPreferences()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = r1.getString(r2, r7)     // Catch: java.lang.Exception -> L41
            if (r1 != 0) goto L43
            java.lang.String r1 = ""
        L3f:
            r9 = r1
            goto L49
        L41:
            goto Laa
        L43:
            java.lang.String r9 = "sharedPreferences.getString(key, null) ?: \"\""
            defpackage.z65.g(r1, r9)     // Catch: java.lang.Exception -> L41
            goto L3f
        L49:
            int r1 = r9.length()     // Catch: java.lang.Exception -> L41
            if (r1 <= 0) goto L52
            r8.savePreferenceToRam(r2, r9)     // Catch: java.lang.Exception -> L41
        L52:
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "String"
            boolean r1 = defpackage.c0b.O(r1, r2, r6, r5, r7)     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L8d
            boolean r1 = defpackage.c0b.J(r9, r0, r6, r5, r7)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "null cannot be cast to non-null type im.threads.business.state.ChatStateEnum"
            if (r1 == 0) goto L81
            boolean r0 = defpackage.c0b.u(r9, r0, r6, r5, r7)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L81
            r0 = 1
            java.lang.String r1 = defpackage.c0b.T0(r9, r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = defpackage.c0b.U0(r1, r0)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L7b
            r3 = r0
            im.threads.business.state.ChatStateEnum r3 = (im.threads.business.state.ChatStateEnum) r3     // Catch: java.lang.Exception -> L41
            goto La2
        L7b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L41
            r0.<init>(r2)     // Catch: java.lang.Exception -> L41
            throw r0     // Catch: java.lang.Exception -> L41
        L81:
            if (r9 == 0) goto L87
            r3 = r9
            im.threads.business.state.ChatStateEnum r3 = (im.threads.business.state.ChatStateEnum) r3     // Catch: java.lang.Exception -> L41
            goto La2
        L87:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L41
            r0.<init>(r2)     // Catch: java.lang.Exception -> L41
            throw r0     // Catch: java.lang.Exception -> L41
        L8d:
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r0.l(r9, r4)     // Catch: java.lang.Exception -> L41
            if (r0 != 0) goto La1
            if (r3 == 0) goto L9b
            goto La2
        L9b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L41
            r0.<init>()     // Catch: java.lang.Exception -> L41
            throw r0     // Catch: java.lang.Exception -> L41
        La1:
            r3 = r0
        La2:
            java.lang.String r0 = "null"
            boolean r0 = defpackage.z65.c(r3, r0)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto Lab
        Laa:
            r3 = r7
        Lab:
            im.threads.business.state.ChatStateEnum r3 = (im.threads.business.state.ChatStateEnum) r3
            if (r3 != 0) goto Lb1
            im.threads.business.state.ChatStateEnum r3 = im.threads.business.state.ChatStateEnum.LOGGED_OUT
        Lb1:
            im.threads.business.state.ChatStateEvent r0 = new im.threads.business.state.ChatStateEvent
            r0.<init>(r3, r6, r5, r7)
            fr6 r0 = defpackage.mua.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.state.ChatState$stateChannel$2.invoke():fr6");
    }
}
