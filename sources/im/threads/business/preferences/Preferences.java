package im.threads.business.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import im.threads.business.logger.LoggerEdna;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b,\u0010-J2\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002J.\u0010\u0011\u001a\u00020\u0010\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001b\u0010!\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lim/threads/business/preferences/Preferences;", "", "T", "", Action.KEY_ATTRIBUTE, "default", "getFromPreferencesFile", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Exception;", "Lkotlin/Exception;", "exc", "Landroid/content/SharedPreferences;", "onGetEncryptedPreferencesException", "obj", "", "save", "(Ljava/lang/String;Ljava/lang/Object;)V", "get", "loadPreferencesInRam$threads_release", "()V", "loadPreferencesInRam", "removeSharedPreferencesFiles$threads_release", "removeSharedPreferencesFiles", "Landroid/content/Context;", "storeName", "Ljava/lang/String;", "encryptedStoreName", "sharedPreferences$delegate", "Lrn5;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "", "preferencesStartKeysCount$delegate", "getPreferencesStartKeysCount", "()I", "preferencesStartKeysCount", "Lqx1;", "coroutineScope", "Lqx1;", "getCoroutineScope", "()Lqx1;", "<init>", "(Landroid/content/Context;)V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class Preferences {
    private static boolean isRamPreferencesLoaded = false;
    public static final String preferencesNamePrefix = "im.threads.internal";
    private final Context context;
    private final qx1 coroutineScope;
    private final String encryptedStoreName;
    private final rn5 preferencesStartKeysCount$delegate;
    private final rn5 sharedPreferences$delegate;
    private final String storeName;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, String> ramPreferences = new HashMap<>();

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lim/threads/business/preferences/Preferences$Companion;", "", "()V", "isRamPreferencesLoaded", "", "()Z", "setRamPreferencesLoaded", "(Z)V", "preferencesNamePrefix", "", "ramPreferences", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPreferenceFromRam", Action.KEY_ATTRIBUTE, "savePreferenceToRam", "", "value", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getPreferenceFromRam(String str) {
            String str2;
            z65.h(str, Action.KEY_ATTRIBUTE);
            try {
                str2 = (String) Preferences.ramPreferences.get(str);
            } catch (Exception unused) {
                str2 = "";
            }
            if (str2 == null) {
                return "";
            }
            return str2;
        }

        public final boolean isRamPreferencesLoaded() {
            return Preferences.isRamPreferencesLoaded;
        }

        public final synchronized void savePreferenceToRam(String str, String str2) {
            try {
                z65.h(str, Action.KEY_ATTRIBUTE);
                HashMap hashMap = Preferences.ramPreferences;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str, str2);
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void setRamPreferencesLoaded(boolean z) {
            Preferences.isRamPreferencesLoaded = z;
        }
    }

    public Preferences(Context context) {
        rn5 b;
        rn5 b2;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.context = context;
        this.storeName = "im.threads.internal.utils.PrefStore";
        this.encryptedStoreName = "im.threads.internal.utils.EncryptedPrefStore";
        b = yn5.b(new Preferences$sharedPreferences$2(this));
        this.sharedPreferences$delegate = b;
        b2 = yn5.b(new Preferences$preferencesStartKeysCount$2(this));
        this.preferencesStartKeysCount$delegate = b2;
        this.coroutineScope = rx1.a(v33.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object get$default(im.threads.business.preferences.Preferences r5, java.lang.String r6, java.lang.Object r7, int r8, java.lang.Object r9) {
        /*
            java.lang.String r0 = "\""
            if (r9 != 0) goto L95
            r9 = 2
            r8 = r8 & r9
            r1 = 0
            if (r8 == 0) goto La
            r7 = r1
        La:
            java.lang.String r8 = "key"
            defpackage.z65.h(r6, r8)
            defpackage.z65.m()
            im.threads.business.preferences.Preferences$get$returnType$1 r8 = new im.threads.business.preferences.Preferences$get$returnType$1
            r8.<init>()
            java.lang.reflect.Type r8 = r8.getType()
            java.lang.String r2 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r8, r2)
            im.threads.business.preferences.Preferences$Companion r2 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r2.getPreferenceFromRam(r6)     // Catch: java.lang.Exception -> L94
            int r4 = r3.length()     // Catch: java.lang.Exception -> L94
            if (r4 != 0) goto L48
            boolean r4 = r2.isRamPreferencesLoaded()     // Catch: java.lang.Exception -> L94
            if (r4 != 0) goto L48
            android.content.SharedPreferences r5 = r5.getSharedPreferences()     // Catch: java.lang.Exception -> L94
            java.lang.String r5 = r5.getString(r6, r1)     // Catch: java.lang.Exception -> L94
            if (r5 != 0) goto L3e
            java.lang.String r5 = ""
        L3e:
            r3 = r5
            int r5 = r3.length()     // Catch: java.lang.Exception -> L94
            if (r5 <= 0) goto L48
            r2.savePreferenceToRam(r6, r3)     // Catch: java.lang.Exception -> L94
        L48:
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Exception -> L94
            java.lang.String r6 = "String"
            r2 = 0
            boolean r5 = defpackage.c0b.O(r5, r6, r2, r9, r1)     // Catch: java.lang.Exception -> L94
            if (r5 == 0) goto L76
            boolean r5 = defpackage.c0b.J(r3, r0, r2, r9, r1)     // Catch: java.lang.Exception -> L94
            java.lang.String r6 = "T"
            r7 = 1
            if (r5 == 0) goto L71
            boolean r5 = defpackage.c0b.u(r3, r0, r2, r9, r1)     // Catch: java.lang.Exception -> L94
            if (r5 == 0) goto L71
            java.lang.String r5 = defpackage.c0b.T0(r3, r7)     // Catch: java.lang.Exception -> L94
            java.lang.String r5 = defpackage.c0b.U0(r5, r7)     // Catch: java.lang.Exception -> L94
            defpackage.z65.n(r7, r6)     // Catch: java.lang.Exception -> L94
        L6f:
            r7 = r5
            goto L8a
        L71:
            defpackage.z65.n(r7, r6)     // Catch: java.lang.Exception -> L94
            r7 = r3
            goto L8a
        L76:
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L94
            r5.<init>()     // Catch: java.lang.Exception -> L94
            java.lang.Object r5 = r5.l(r3, r8)     // Catch: java.lang.Exception -> L94
            if (r5 != 0) goto L6f
            if (r7 == 0) goto L84
            goto L8a
        L84:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L94
            r5.<init>()     // Catch: java.lang.Exception -> L94
            throw r5     // Catch: java.lang.Exception -> L94
        L8a:
            java.lang.String r5 = "null"
            boolean r5 = defpackage.z65.c(r7, r5)     // Catch: java.lang.Exception -> L94
            if (r5 == 0) goto L93
            goto L94
        L93:
            r1 = r7
        L94:
            return r1
        L95:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Super calls with default arguments not supported in this target, function: get"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.preferences.Preferences.get$default(im.threads.business.preferences.Preferences, java.lang.String, java.lang.Object, int, java.lang.Object):java.lang.Object");
    }

    private final /* synthetic */ <T> T getFromPreferencesFile(String str, T t) {
        String str2;
        Object i;
        z65.m();
        Type type = new Preferences$getFromPreferencesFile$returnType$1().getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        try {
            Object l = new Gson().l(getSharedPreferences().getString(str, null), type);
            if (l == null) {
                if (t != null) {
                    l = t;
                } else {
                    throw new NullPointerException();
                }
            }
            if (z65.c(l, "null")) {
                return null;
            }
            return (T) l;
        } catch (Exception unused) {
            if (getSharedPreferences().getAll().keySet().contains(str)) {
                Map<String, ?> all = getSharedPreferences().getAll();
                z65.g(all, "sharedPreferences.all");
                i = g86.i(all, str);
                T t2 = (T) i;
                z65.n(3, "T");
                if (t2 instanceof Object) {
                    getSharedPreferences().edit().remove(str);
                    if (t2 == null) {
                        str2 = null;
                    } else if (t2 instanceof String) {
                        str2 = (String) t2;
                    } else {
                        str2 = new Gson().t(t2).toString();
                    }
                    Companion.savePreferenceToRam(str, str2);
                    sh0.d(getCoroutineScope(), null, null, new Preferences$save$1(this, str, str2, null), 3, null);
                    return t2;
                }
            }
            return t;
        }
    }

    static /* synthetic */ Object getFromPreferencesFile$default(Preferences preferences, String str, Object obj, int i, Object obj2) {
        Object i2;
        String str2;
        if (obj2 == null) {
            if ((i & 2) != 0) {
                obj = null;
            }
            z65.m();
            Type type = new Preferences$getFromPreferencesFile$returnType$1().getType();
            z65.g(type, "object : TypeToken<T>() {}.type");
            try {
                Object l = new Gson().l(preferences.getSharedPreferences().getString(str, null), type);
                if (l == null) {
                    if (obj != null) {
                        l = obj;
                    } else {
                        throw new NullPointerException();
                    }
                }
                if (z65.c(l, "null")) {
                    return null;
                }
                return l;
            } catch (Exception unused) {
                if (preferences.getSharedPreferences().getAll().keySet().contains(str)) {
                    Map<String, ?> all = preferences.getSharedPreferences().getAll();
                    z65.g(all, "sharedPreferences.all");
                    i2 = g86.i(all, str);
                    z65.n(3, "T");
                    if (i2 instanceof Object) {
                        preferences.getSharedPreferences().edit().remove(str);
                        if (i2 == null) {
                            str2 = null;
                        } else if (i2 instanceof String) {
                            str2 = (String) i2;
                        } else {
                            str2 = new Gson().t(i2).toString();
                        }
                        Companion.savePreferenceToRam(str, str2);
                        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, str, str2, null), 3, null);
                        return i2;
                    }
                }
                return obj;
            }
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFromPreferencesFile");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences onGetEncryptedPreferencesException(Context context, Exception exc) {
        LoggerEdna.error(exc);
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.storeName, 0);
        z65.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ <T> T get(java.lang.String r8, T r9) {
        /*
            r7 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = "key"
            defpackage.z65.h(r8, r1)
            defpackage.z65.m()
            im.threads.business.preferences.Preferences$get$returnType$1 r1 = new im.threads.business.preferences.Preferences$get$returnType$1
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.String r2 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r1, r2)
            r2 = 0
            im.threads.business.preferences.Preferences$Companion r3 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> L8d
            java.lang.String r4 = r3.getPreferenceFromRam(r8)     // Catch: java.lang.Exception -> L8d
            int r5 = r4.length()     // Catch: java.lang.Exception -> L8d
            if (r5 != 0) goto L40
            boolean r5 = r3.isRamPreferencesLoaded()     // Catch: java.lang.Exception -> L8d
            if (r5 != 0) goto L40
            android.content.SharedPreferences r4 = r7.getSharedPreferences()     // Catch: java.lang.Exception -> L8d
            java.lang.String r4 = r4.getString(r8, r2)     // Catch: java.lang.Exception -> L8d
            if (r4 != 0) goto L37
            java.lang.String r4 = ""
        L37:
            int r5 = r4.length()     // Catch: java.lang.Exception -> L8d
            if (r5 <= 0) goto L40
            r3.savePreferenceToRam(r8, r4)     // Catch: java.lang.Exception -> L8d
        L40:
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Exception -> L8d
            java.lang.String r3 = "String"
            r5 = 2
            r6 = 0
            boolean r8 = defpackage.c0b.O(r8, r3, r6, r5, r2)     // Catch: java.lang.Exception -> L8d
            if (r8 == 0) goto L6f
            boolean r8 = defpackage.c0b.J(r4, r0, r6, r5, r2)     // Catch: java.lang.Exception -> L8d
            java.lang.String r9 = "T"
            r1 = 1
            if (r8 == 0) goto L6a
            boolean r8 = defpackage.c0b.u(r4, r0, r6, r5, r2)     // Catch: java.lang.Exception -> L8d
            if (r8 == 0) goto L6a
            java.lang.String r8 = defpackage.c0b.T0(r4, r1)     // Catch: java.lang.Exception -> L8d
            java.lang.String r8 = defpackage.c0b.U0(r8, r1)     // Catch: java.lang.Exception -> L8d
            defpackage.z65.n(r1, r9)     // Catch: java.lang.Exception -> L8d
        L68:
            r9 = r8
            goto L83
        L6a:
            defpackage.z65.n(r1, r9)     // Catch: java.lang.Exception -> L8d
            r9 = r4
            goto L83
        L6f:
            com.google.gson.Gson r8 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L8d
            r8.<init>()     // Catch: java.lang.Exception -> L8d
            java.lang.Object r8 = r8.l(r4, r1)     // Catch: java.lang.Exception -> L8d
            if (r8 != 0) goto L68
            if (r9 == 0) goto L7d
            goto L83
        L7d:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L8d
            r8.<init>()     // Catch: java.lang.Exception -> L8d
            throw r8     // Catch: java.lang.Exception -> L8d
        L83:
            java.lang.String r8 = "null"
            boolean r8 = defpackage.z65.c(r9, r8)     // Catch: java.lang.Exception -> L8d
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r9
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.preferences.Preferences.get(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final qx1 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final int getPreferencesStartKeysCount() {
        return ((Number) this.preferencesStartKeysCount$delegate.getValue()).intValue();
    }

    public final SharedPreferences getSharedPreferences() {
        return (SharedPreferences) this.sharedPreferences$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadPreferencesInRam$threads_release() {
        /*
            r13 = this;
            android.content.SharedPreferences r0 = r13.getSharedPreferences()     // Catch: java.lang.Exception -> Ldd
            java.util.Map r0 = r0.getAll()     // Catch: java.lang.Exception -> Ldd
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Exception -> Ldd
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> Ldd
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Ldd
        L12:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> Ldd
            if (r1 == 0) goto Ld9
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Ldd
            im.threads.business.preferences.Preferences$Companion r2 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = "it"
            defpackage.z65.g(r1, r3)     // Catch: java.lang.Exception -> Lbe
            im.threads.business.preferences.Preferences$loadPreferencesInRam$lambda$0$$inlined$getFromPreferencesFile$default$1 r3 = new im.threads.business.preferences.Preferences$loadPreferencesInRam$lambda$0$$inlined$getFromPreferencesFile$default$1     // Catch: java.lang.Exception -> Lbe
            r3.<init>()     // Catch: java.lang.Exception -> Lbe
            java.lang.reflect.Type r3 = r3.getType()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r4 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r3, r4)     // Catch: java.lang.Exception -> Lbe
            r4 = 0
            android.content.SharedPreferences r5 = r13.getSharedPreferences()     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = r5.getString(r1, r4)     // Catch: java.lang.Exception -> L56
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L56
            r6.<init>()     // Catch: java.lang.Exception -> L56
            java.lang.Object r3 = r6.l(r5, r3)     // Catch: java.lang.Exception -> L56
            if (r3 == 0) goto L50
            java.lang.String r5 = "null"
            boolean r5 = defpackage.z65.c(r3, r5)     // Catch: java.lang.Exception -> L56
            if (r5 == 0) goto Lb2
            goto Lb3
        L50:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L56
            r3.<init>()     // Catch: java.lang.Exception -> L56
            throw r3     // Catch: java.lang.Exception -> L56
        L56:
            android.content.SharedPreferences r3 = r13.getSharedPreferences()     // Catch: java.lang.Exception -> Lbe
            java.util.Map r3 = r3.getAll()     // Catch: java.lang.Exception -> Lbe
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Exception -> Lbe
            boolean r3 = r3.contains(r1)     // Catch: java.lang.Exception -> Lbe
            if (r3 == 0) goto Lb3
            android.content.SharedPreferences r3 = r13.getSharedPreferences()     // Catch: java.lang.Exception -> Lbe
            java.util.Map r3 = r3.getAll()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r5 = "sharedPreferences.all"
            defpackage.z65.g(r3, r5)     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r3 = defpackage.d86.i(r3, r1)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto Lb3
            android.content.SharedPreferences r5 = r13.getSharedPreferences()     // Catch: java.lang.Exception -> Lbe
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> Lbe
            r5.remove(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> Lbe
            if (r5 == 0) goto L90
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lbe
            goto L9d
        L90:
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch: java.lang.Exception -> Lbe
            r5.<init>()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r5 = r5.t(r3)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lbe
        L9d:
            im.threads.business.preferences.Preferences$Companion r6 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> Lbe
            r6.savePreferenceToRam(r1, r5)     // Catch: java.lang.Exception -> Lbe
            qx1 r7 = r13.getCoroutineScope()     // Catch: java.lang.Exception -> Lbe
            r8 = 0
            r9 = 0
            im.threads.business.preferences.Preferences$save$1 r10 = new im.threads.business.preferences.Preferences$save$1     // Catch: java.lang.Exception -> Lbe
            r10.<init>(r13, r1, r5, r4)     // Catch: java.lang.Exception -> Lbe
            r11 = 3
            r12 = 0
            defpackage.qh0.d(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lbe
        Lb2:
            r4 = r3
        Lb3:
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lbe
            if (r4 != 0) goto Lb9
            java.lang.String r4 = ""
        Lb9:
            r2.savePreferenceToRam(r1, r4)     // Catch: java.lang.Exception -> Lbe
            goto L12
        Lbe:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r2.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r3 = "Error when saving "
            r2.append(r3)     // Catch: java.lang.Exception -> Ldd
            r2.append(r1)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r1 = " to RAM preferences"
            r2.append(r1)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> Ldd
            im.threads.business.logger.LoggerEdna.error(r1)     // Catch: java.lang.Exception -> Ldd
            goto L12
        Ld9:
            r0 = 1
            im.threads.business.preferences.Preferences.isRamPreferencesLoaded = r0     // Catch: java.lang.Exception -> Ldd
            goto Le2
        Ldd:
            java.lang.String r0 = "Error when saving all shared preferences keys to RAM preferences"
            im.threads.business.logger.LoggerEdna.error(r0)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.preferences.Preferences.loadPreferencesInRam$threads_release():void");
    }

    public final void removeSharedPreferencesFiles$threads_release() {
        String str;
        boolean J;
        String F;
        try {
            String parent = this.context.getFilesDir().getParent();
            if (parent != null) {
                str = parent + "/shared_prefs/";
            } else {
                str = null;
            }
            z65.e(str);
            File file = new File(str);
            String[] list = file.list();
            if (list != null) {
                int length = list.length;
                for (int i = 0; i < length; i++) {
                    String str2 = list[i];
                    z65.g(str2, "children[i]");
                    J = l0b.J(str2, preferencesNamePrefix, false, 2, null);
                    if (J) {
                        try {
                            Context context = this.context;
                            String str3 = list[i];
                            z65.g(str3, "children[i]");
                            F = l0b.F(str3, ".xml", "", false, 4, null);
                            context.getSharedPreferences(F, 0).edit().clear().commit();
                        } catch (Exception unused) {
                        }
                        new File(file, list[i]).delete();
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final /* synthetic */ <T> void save(String str, T t) {
        String str2;
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (t == null) {
            str2 = null;
        } else if (t instanceof String) {
            str2 = (String) t;
        } else {
            str2 = new Gson().t(t).toString();
        }
        Companion.savePreferenceToRam(str, str2);
        sh0.d(getCoroutineScope(), null, null, new Preferences$save$1(this, str, str2, null), 3, null);
    }
}
