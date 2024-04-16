package im.threads.business.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.ConsultInfo;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.Preferences$save$1;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConsultWriter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lim/threads/business/utils/ConsultWriter;", "", "preferences", "Lim/threads/business/preferences/Preferences;", "(Lim/threads/business/preferences/Preferences;)V", "isSearching", "", "isSearchingConsult", "()Z", "setSearchingConsult", "(Z)V", "getConsultInfo", "Lim/threads/business/models/ConsultInfo;", "id", "", "getCurrentConsultId", "getCurrentConsultInfo", "getCurrentPhotoUrl", "getName", "getOrgUnit", "getPhotoUrl", "getRole", "getStatus", "isConsultConnected", "setCurrentConsultInfo", "", "message", "Lim/threads/business/models/ConsultConnectionMessage;", "setCurrentConsultLeft", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsultWriter {
    public static final Companion Companion = new Companion(null);
    public static final String OPERATOR_ID = "OPERATOR_ID";
    private static final String OPERATOR_NAME = "OPERATOR_NAME";
    private static final String OPERATOR_ORG_UNIT = "OPERATOR_ORG_UNIT";
    private static final String OPERATOR_PHOTO = "OPERATOR_PHOTO";
    private static final String OPERATOR_ROLE = "OPERATOR_ROLE";
    private static final String OPERATOR_STATUS = "OPERATOR_STATUS";
    private static final String OPERATOR_TITLE = "OPERATOR_TITLE";
    private static final String SEARCHING_CONSULT = "SEARCHING_CONSULT";
    private final Preferences preferences;

    /* compiled from: ConsultWriter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lim/threads/business/utils/ConsultWriter$Companion;", "", "()V", ConsultWriter.OPERATOR_ID, "", ConsultWriter.OPERATOR_NAME, ConsultWriter.OPERATOR_ORG_UNIT, ConsultWriter.OPERATOR_PHOTO, ConsultWriter.OPERATOR_ROLE, ConsultWriter.OPERATOR_STATUS, ConsultWriter.OPERATOR_TITLE, ConsultWriter.SEARCHING_CONSULT, "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ConsultWriter(Preferences preferences) {
        z65.h(preferences, "preferences");
        this.preferences = preferences;
    }

    private final String getName(String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str2 = OPERATOR_NAME + str;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getName$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str2);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(str2, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(str2, str4);
                        str3 = str4;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    private final String getOrgUnit(String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str2 = OPERATOR_ORG_UNIT + str;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getOrgUnit$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str2);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(str2, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(str2, str4);
                        str3 = str4;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    private final String getPhotoUrl(String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str2 = OPERATOR_PHOTO + str;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getPhotoUrl$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str2);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(str2, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(str2, str4);
                        str3 = str4;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    private final String getRole(String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str2 = OPERATOR_ROLE + str;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getRole$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str2);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(str2, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(str2, str4);
                        str3 = str4;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    private final String getStatus(String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str2 = OPERATOR_STATUS + str;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getStatus$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str2);
            int length = preferenceFromRam.length();
            String str3 = preferenceFromRam;
            if (length == 0) {
                str3 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(str2, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str4 = string;
                    int length2 = str4.length();
                    str3 = str4;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(str2, str4);
                        str3 = str4;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str3, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str3, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str3, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str3;
            } else {
                Object l = new Gson().l(str3, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    public final ConsultInfo getConsultInfo(String str) {
        z65.h(str, "id");
        return new ConsultInfo(getName(str), str, getStatus(str), getOrgUnit(str), getRole(str), getPhotoUrl(str));
    }

    public final String getCurrentConsultId() {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        Type type = new TypeToken<String>() { // from class: im.threads.business.utils.ConsultWriter$getCurrentConsultId$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(OPERATOR_ID);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(OPERATOR_ID, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(OPERATOR_ID, str2);
                        str = str2;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str;
            } else {
                Object l = new Gson().l(str, type);
                obj = l;
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(obj, "null")) {
                obj2 = obj;
            }
        } catch (Exception unused) {
        }
        return (String) obj2;
    }

    public final ConsultInfo getCurrentConsultInfo() {
        String currentConsultId = getCurrentConsultId();
        if (currentConsultId != null) {
            return getConsultInfo(currentConsultId);
        }
        return null;
    }

    public final String getCurrentPhotoUrl() {
        if (getCurrentConsultId() != null) {
            return getPhotoUrl(getCurrentConsultId());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        if (r0 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isConsultConnected() {
        /*
            r10 = this;
            java.lang.String r0 = "\""
            im.threads.business.preferences.Preferences r1 = r10.preferences
            java.lang.String r2 = "OPERATOR_ID"
            im.threads.business.utils.ConsultWriter$isConsultConnected$$inlined$get$default$1 r3 = new im.threads.business.utils.ConsultWriter$isConsultConnected$$inlined$get$default$1
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.String r4 = "object : TypeToken<T>() {}.type"
            defpackage.z65.g(r3, r4)
            r4 = 1
            r5 = 0
            r6 = 0
            im.threads.business.preferences.Preferences$Companion r7 = im.threads.business.preferences.Preferences.Companion     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = r7.getPreferenceFromRam(r2)     // Catch: java.lang.Exception -> L37
            int r9 = r8.length()     // Catch: java.lang.Exception -> L37
            if (r9 != 0) goto L48
            boolean r9 = r7.isRamPreferencesLoaded()     // Catch: java.lang.Exception -> L37
            if (r9 != 0) goto L48
            android.content.SharedPreferences r1 = r1.getSharedPreferences()     // Catch: java.lang.Exception -> L37
            java.lang.String r1 = r1.getString(r2, r6)     // Catch: java.lang.Exception -> L37
            if (r1 != 0) goto L39
            java.lang.String r1 = ""
        L35:
            r8 = r1
            goto L3f
        L37:
            goto L99
        L39:
            java.lang.String r8 = "sharedPreferences.getString(key, null) ?: \"\""
            defpackage.z65.g(r1, r8)     // Catch: java.lang.Exception -> L37
            goto L35
        L3f:
            int r1 = r8.length()     // Catch: java.lang.Exception -> L37
            if (r1 <= 0) goto L48
            r7.savePreferenceToRam(r2, r8)     // Catch: java.lang.Exception -> L37
        L48:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "String"
            r7 = 2
            boolean r1 = defpackage.c0b.O(r1, r2, r5, r7, r6)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L7d
            boolean r1 = defpackage.c0b.J(r8, r0, r5, r7, r6)     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            if (r1 == 0) goto L74
            boolean r0 = defpackage.c0b.u(r8, r0, r5, r7, r6)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L74
            java.lang.String r0 = defpackage.c0b.T0(r8, r4)     // Catch: java.lang.Exception -> L37
            java.lang.String r8 = defpackage.c0b.U0(r0, r4)     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L6e
            goto L88
        L6e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L37
            r0.<init>(r2)     // Catch: java.lang.Exception -> L37
            throw r0     // Catch: java.lang.Exception -> L37
        L74:
            if (r8 == 0) goto L77
            goto L88
        L77:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L37
            r0.<init>(r2)     // Catch: java.lang.Exception -> L37
            throw r0     // Catch: java.lang.Exception -> L37
        L7d:
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L37
            r0.<init>()     // Catch: java.lang.Exception -> L37
            java.lang.Object r8 = r0.l(r8, r3)     // Catch: java.lang.Exception -> L37
            if (r8 == 0) goto L93
        L88:
            java.lang.String r0 = "null"
            boolean r0 = defpackage.z65.c(r8, r0)     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L91
            goto L99
        L91:
            r6 = r8
            goto L99
        L93:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L37
            r0.<init>()     // Catch: java.lang.Exception -> L37
            throw r0     // Catch: java.lang.Exception -> L37
        L99:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto La3
            boolean r0 = defpackage.c0b.y(r6)
            if (r0 == 0) goto La4
        La3:
            r5 = 1
        La4:
            r0 = r5 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.utils.ConsultWriter.isConsultConnected():boolean");
    }

    public final boolean isSearchingConsult() {
        boolean O;
        Object l;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        Preferences preferences = this.preferences;
        String str = ConsultWriter.class + "SEARCHING_CONSULT}";
        Type type = new TypeToken<Boolean>() { // from class: im.threads.business.utils.ConsultWriter$special$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(str);
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(str, null);
                if (string == null) {
                    string = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                }
                preferenceFromRam = string;
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(str, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 != null) {
                            l = (Boolean) U0;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    l = (Boolean) preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else {
                l = new Gson().l(preferenceFromRam, type);
                if (l == null) {
                    throw new NullPointerException();
                }
            }
            if (!z65.c(l, "null")) {
                obj = l;
            }
        } catch (Exception unused) {
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void setCurrentConsultInfo(ConsultConnectionMessage consultConnectionMessage) {
        String str;
        z65.h(consultConnectionMessage, "message");
        String consultId = consultConnectionMessage.getConsultId();
        Preferences preferences = this.preferences;
        if (consultId == null) {
            str = null;
        } else {
            str = consultId;
        }
        Preferences.Companion companion = Preferences.Companion;
        companion.savePreferenceToRam(OPERATOR_ID, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, OPERATOR_ID, str, null), 3, null);
        Preferences preferences2 = this.preferences;
        String str2 = OPERATOR_STATUS + consultId;
        String status = consultConnectionMessage.getStatus();
        if (status == null) {
            status = null;
        }
        companion.savePreferenceToRam(str2, status);
        sh0.d(preferences2.getCoroutineScope(), null, null, new Preferences$save$1(preferences2, str2, status, null), 3, null);
        Preferences preferences3 = this.preferences;
        String str3 = OPERATOR_NAME + consultId;
        String name = consultConnectionMessage.getName();
        if (name == null) {
            name = null;
        }
        companion.savePreferenceToRam(str3, name);
        sh0.d(preferences3.getCoroutineScope(), null, null, new Preferences$save$1(preferences3, str3, name, null), 3, null);
        Preferences preferences4 = this.preferences;
        String str4 = OPERATOR_TITLE + consultId;
        String title = consultConnectionMessage.getTitle();
        if (title == null) {
            title = null;
        }
        companion.savePreferenceToRam(str4, title);
        sh0.d(preferences4.getCoroutineScope(), null, null, new Preferences$save$1(preferences4, str4, title, null), 3, null);
        Preferences preferences5 = this.preferences;
        String str5 = OPERATOR_ORG_UNIT + consultId;
        String orgUnit = consultConnectionMessage.getOrgUnit();
        if (orgUnit == null) {
            orgUnit = null;
        }
        companion.savePreferenceToRam(str5, orgUnit);
        sh0.d(preferences5.getCoroutineScope(), null, null, new Preferences$save$1(preferences5, str5, orgUnit, null), 3, null);
        Preferences preferences6 = this.preferences;
        String str6 = OPERATOR_ROLE + consultId;
        String role = consultConnectionMessage.getRole();
        if (role == null) {
            role = null;
        }
        companion.savePreferenceToRam(str6, role);
        sh0.d(preferences6.getCoroutineScope(), null, null, new Preferences$save$1(preferences6, str6, role, null), 3, null);
        Preferences preferences7 = this.preferences;
        String str7 = OPERATOR_PHOTO + consultId;
        String avatarPath = consultConnectionMessage.getAvatarPath();
        if (avatarPath == null) {
            avatarPath = null;
        }
        companion.savePreferenceToRam(str7, avatarPath);
        sh0.d(preferences7.getCoroutineScope(), null, null, new Preferences$save$1(preferences7, str7, avatarPath, null), 3, null);
    }

    public final void setCurrentConsultLeft() {
        Preferences preferences = this.preferences;
        Preferences.Companion.savePreferenceToRam(OPERATOR_ID, null);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, OPERATOR_ID, null, null), 3, null);
    }

    public final void setSearchingConsult(boolean z) {
        String str;
        Preferences preferences = this.preferences;
        String str2 = ConsultWriter.class + "SEARCHING_CONSULT}";
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf instanceof String) {
            str = (String) valueOf;
        } else {
            str = new Gson().t(valueOf).toString();
        }
        Preferences.Companion.savePreferenceToRam(str2, str);
        sh0.d(preferences.getCoroutineScope(), null, null, new Preferences$save$1(preferences, str2, str, null), 3, null);
    }
}
