package im.threads.business.transport;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import im.threads.business.UserInfoBuilder;
import im.threads.business.models.FileDescription;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.Survey;
import im.threads.business.preferences.Preferences;
import im.threads.business.preferences.PreferencesCoreKeys;
import im.threads.business.rest.queries.ThreadsApi;
import im.threads.business.utils.AppInfo;
import im.threads.business.utils.ClientUseCase;
import im.threads.business.utils.DeviceInfo;
import im.threads.business.utils.FileUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: OutgoingMessageCreator.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007J&\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ4\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010\u00072\b\u0010$\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lim/threads/business/transport/OutgoingMessageCreator;", "", "Lim/threads/business/models/FileDescription;", "fileDescription", "Lca5;", "attachmentsFromFileDescription", "attachmentsFromMfmsPath", "", "mfmsFilepath", "Lim/threads/business/UserInfoBuilder;", "userInfo", "Lmb5;", "createInitChatMessage", "locale", "", "isPreregister", "createClientInfoMessage", "input", "createMessageTyping", "Lim/threads/business/models/Survey;", "survey", "createRatingDoneMessage", "createResolveThreadMessage", "createReopenThreadMessage", MessageAttributes.CLIENT_ID, "appMarker", "createMessageClientOffline", "", "latitude", "longitude", "createMessageUpdateLocation", "Lim/threads/business/models/UserPhrase;", "userPhrase", "Lim/threads/business/models/ConsultInfo;", "consultInfo", "quoteMfmsFilePath", "mfmsFilePath", "createUserPhraseMessage", "Lim/threads/business/preferences/Preferences;", "preferences", "Lim/threads/business/preferences/Preferences;", "Lim/threads/business/utils/ClientUseCase;", "clientUseCase", "Lim/threads/business/utils/ClientUseCase;", "Lim/threads/business/utils/AppInfo;", "appInfo", "Lim/threads/business/utils/AppInfo;", "Lim/threads/business/utils/DeviceInfo;", "deviceInfo", "Lim/threads/business/utils/DeviceInfo;", "<init>", "(Lim/threads/business/preferences/Preferences;Lim/threads/business/utils/ClientUseCase;Lim/threads/business/utils/AppInfo;Lim/threads/business/utils/DeviceInfo;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class OutgoingMessageCreator {
    private final AppInfo appInfo;
    private final ClientUseCase clientUseCase;
    private final DeviceInfo deviceInfo;
    private final Preferences preferences;

    public OutgoingMessageCreator(Preferences preferences, ClientUseCase clientUseCase, AppInfo appInfo, DeviceInfo deviceInfo) {
        z65.h(preferences, "preferences");
        z65.h(clientUseCase, "clientUseCase");
        z65.h(appInfo, "appInfo");
        z65.h(deviceInfo, "deviceInfo");
        this.preferences = preferences;
        this.clientUseCase = clientUseCase;
        this.appInfo = appInfo;
        this.deviceInfo = deviceInfo;
    }

    private final ca5 attachmentsFromFileDescription(FileDescription fileDescription) {
        ca5 ca5Var = new ca5();
        if (fileDescription != null) {
            mb5 mb5Var = new mb5();
            mb5Var.z(MessageAttributes.TYPE, FileUtils.getMimeType(fileDescription));
            Uri fileUri = fileDescription.getFileUri();
            if (fileUri != null) {
                mb5Var.z(Action.NAME_ATTRIBUTE, FileUtils.getFileName(fileUri));
                mb5Var.x("size", Long.valueOf(FileUtils.getFileSize(fileUri)));
            }
            mb5Var.x("lastModified", 0);
            mb5 mb5Var2 = new mb5();
            mb5Var2.v("optional", mb5Var);
            ca5Var.v(mb5Var2);
        }
        return ca5Var;
    }

    private final ca5 attachmentsFromMfmsPath(FileDescription fileDescription) {
        ca5 ca5Var = new ca5();
        if (fileDescription != null) {
            mb5 mb5Var = new mb5();
            String incomingName = fileDescription.getIncomingName();
            if (incomingName != null && incomingName.length() != 0) {
                Uri parse = Uri.parse(fileDescription.getIncomingName());
                z65.g(parse, "parse(it.incomingName)");
                mb5Var.z(MessageAttributes.TYPE, FileUtils.getMimeType(parse));
            }
            mb5Var.z(Action.NAME_ATTRIBUTE, fileDescription.getIncomingName());
            mb5Var.x("size", Long.valueOf(fileDescription.getSize()));
            mb5Var.x("lastModified", Long.valueOf(System.currentTimeMillis()));
            mb5 mb5Var2 = new mb5();
            mb5Var2.v("optional", mb5Var);
            ca5Var.v(mb5Var2);
        }
        return ca5Var;
    }

    public final mb5 createClientInfoMessage(UserInfoBuilder userInfoBuilder, String str, boolean z) {
        boolean O;
        boolean J;
        boolean u;
        String T0;
        z65.h(userInfoBuilder, "userInfo");
        z65.h(str, "locale");
        Preferences preferences = this.preferences;
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.OutgoingMessageCreator$createClientInfoMessage$$inlined$get$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            Object obj2 = "";
            if (preferenceFromRam.length() == 0 && !companion.isRamPreferencesLoaded()) {
                String string = preferences.getSharedPreferences().getString(device_address, null);
                if (string == null) {
                    preferenceFromRam = "";
                } else {
                    z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    preferenceFromRam = string;
                }
                if (preferenceFromRam.length() > 0) {
                    companion.savePreferenceToRam(device_address, preferenceFromRam);
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(preferenceFromRam, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(preferenceFromRam, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(preferenceFromRam, 1);
                        obj2 = o0b.U0(T0, 1);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                if (preferenceFromRam != null) {
                    obj2 = preferenceFromRam;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                Object l = new Gson().l(preferenceFromRam, type);
                if (l != null) {
                    obj2 = l;
                }
            }
            if (!z65.c(obj2, "null")) {
                obj = obj2;
            }
        } catch (Exception unused) {
        }
        String str2 = (String) obj;
        mb5 mb5Var = new mb5();
        mb5Var.z(Action.NAME_ATTRIBUTE, userInfoBuilder.getUserName());
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.w(MessageAttributes.CLIENT_ID_ENCRYPTED, Boolean.valueOf(userInfoBuilder.getClientIdEncrypted()));
        String clientData = userInfoBuilder.getClientData();
        if (clientData != null) {
            mb5Var.z("data", clientData);
        }
        mb5Var.z("platform", "Android");
        mb5Var.z("osVersion", this.deviceInfo.getOsVersion());
        mb5Var.z("device", this.deviceInfo.getDeviceName());
        mb5Var.z("ip", this.deviceInfo.getIpAddress());
        mb5Var.z("appVersion", this.appInfo.getAppVersion());
        mb5Var.z("appName", this.appInfo.getAppName());
        mb5Var.z(MessageAttributes.APP_BUNDLE_KEY, this.appInfo.getAppId());
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        mb5Var.z("libVersion", this.appInfo.getLibVersion());
        mb5Var.z("clientLocale", str);
        mb5Var.z("chatApiVersion", ThreadsApi.Companion.getApiVersion());
        mb5Var.z(MessageAttributes.TYPE, "CLIENT_INFO");
        mb5Var.z(MessageAttributes.DEVICE_ADDRESS, str2);
        Boolean bool = Boolean.TRUE;
        mb5Var.w(MessageAttributes.AUTHORIZED, bool);
        if (z) {
            mb5Var.w("preRegister", bool);
        }
        return mb5Var;
    }

    public final mb5 createInitChatMessage(UserInfoBuilder userInfoBuilder) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        z65.h(userInfoBuilder, "userInfo");
        mb5 mb5Var = new mb5();
        Preferences preferences = this.preferences;
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.OutgoingMessageCreator$createInitChatMessage$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str = preferenceFromRam;
            if (length == 0) {
                str = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        string = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                    }
                    String str2 = string;
                    int length2 = str2.length();
                    str = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str2);
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
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.z(MessageAttributes.TYPE, "INIT_CHAT");
        mb5Var.z("data", userInfoBuilder.getClientData());
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        mb5Var.z(MessageAttributes.DEVICE_ADDRESS, (String) obj2);
        return mb5Var;
    }

    public final mb5 createMessageClientOffline(String str, String str2) {
        z65.h(str, MessageAttributes.CLIENT_ID);
        mb5 mb5Var = new mb5();
        mb5Var.z(MessageAttributes.CLIENT_ID, str);
        mb5Var.z(MessageAttributes.TYPE, "CLIENT_OFFLINE");
        mb5Var.z("appMarker", str2);
        return mb5Var;
    }

    public final mb5 createMessageTyping(UserInfoBuilder userInfoBuilder, String str) {
        boolean O;
        Object obj;
        boolean J;
        boolean u;
        String T0;
        Object U0;
        String str2;
        String str3 = "";
        z65.h(userInfoBuilder, "userInfo");
        Preferences preferences = this.preferences;
        String device_address = PreferencesCoreKeys.INSTANCE.getDEVICE_ADDRESS();
        Type type = new TypeToken<String>() { // from class: im.threads.business.transport.OutgoingMessageCreator$createMessageTyping$$inlined$get$default$1
        }.getType();
        z65.g(type, "object : TypeToken<T>() {}.type");
        Object obj2 = null;
        try {
            Preferences.Companion companion = Preferences.Companion;
            String preferenceFromRam = companion.getPreferenceFromRam(device_address);
            int length = preferenceFromRam.length();
            String str4 = preferenceFromRam;
            if (length == 0) {
                str4 = preferenceFromRam;
                if (!companion.isRamPreferencesLoaded()) {
                    String string = preferences.getSharedPreferences().getString(device_address, null);
                    if (string == null) {
                        str2 = "";
                    } else {
                        z65.g(string, "sharedPreferences.getString(key, null) ?: \"\"");
                        str2 = string;
                    }
                    int length2 = str2.length();
                    str4 = str2;
                    if (length2 > 0) {
                        companion.savePreferenceToRam(device_address, str2);
                        str4 = str2;
                    }
                }
            }
            O = m0b.O(type.toString(), "String", false, 2, null);
            if (O) {
                J = l0b.J(str4, "\"", false, 2, null);
                if (J) {
                    u = l0b.u(str4, "\"", false, 2, null);
                    if (u) {
                        T0 = o0b.T0(str4, 1);
                        U0 = o0b.U0(T0, 1);
                        if (U0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        obj = U0;
                    }
                }
                if (str4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                obj = str4;
            } else {
                Object l = new Gson().l(str4, type);
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
        String str5 = (String) obj2;
        if (str5 != null) {
            str3 = str5;
        }
        mb5 mb5Var = new mb5();
        mb5Var.z(MessageAttributes.TYPE, "TYPING");
        mb5Var.z(MessageAttributes.TYPING_DRAFT, str);
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        mb5Var.z(MessageAttributes.DEVICE_ADDRESS, str3);
        return mb5Var;
    }

    public final mb5 createMessageUpdateLocation(double d, double d2, String str, UserInfoBuilder userInfoBuilder) {
        z65.h(str, "locale");
        z65.h(userInfoBuilder, "userInfo");
        mb5 mb5Var = new mb5();
        mb5 mb5Var2 = new mb5();
        mb5Var2.z(MessageAttributes.COORDINATES, d + ", " + d2);
        mb5Var.z("data", mb5Var2.toString());
        mb5Var.z(Action.NAME_ATTRIBUTE, userInfoBuilder.getUserName());
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.w(MessageAttributes.CLIENT_ID_ENCRYPTED, Boolean.valueOf(userInfoBuilder.getClientIdEncrypted()));
        mb5Var.z("platform", "Android");
        mb5Var.z("osVersion", this.deviceInfo.getOsVersion());
        mb5Var.z("device", this.deviceInfo.getDeviceName());
        mb5Var.z("ip", this.deviceInfo.getIpAddress());
        mb5Var.z("appVersion", this.appInfo.getAppVersion());
        mb5Var.z("appName", this.appInfo.getAppName());
        mb5Var.z(MessageAttributes.APP_BUNDLE_KEY, this.appInfo.getAppId());
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        mb5Var.z("libVersion", this.appInfo.getLibVersion());
        mb5Var.z("clientLocale", str);
        mb5Var.z("chatApiVersion", ThreadsApi.Companion.getApiVersion());
        mb5Var.z(MessageAttributes.TYPE, "UPDATE_LOCATION");
        return mb5Var;
    }

    public final mb5 createRatingDoneMessage(UserInfoBuilder userInfoBuilder, Survey survey) {
        z65.h(userInfoBuilder, "userInfo");
        z65.h(survey, "survey");
        mb5 mb5Var = new mb5();
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.z(MessageAttributes.TYPE, "SURVEY_QUESTION_ANSWER");
        mb5Var.x("sendingId", Long.valueOf(survey.getSendingId()));
        ArrayList<QuestionDTO> questions = survey.getQuestions();
        if (questions != null && !questions.isEmpty()) {
            ArrayList<QuestionDTO> questions2 = survey.getQuestions();
            z65.e(questions2);
            mb5Var.x("questionId", Long.valueOf(questions2.get(0).getId()));
            ArrayList<QuestionDTO> questions3 = survey.getQuestions();
            z65.e(questions3);
            mb5Var.x("rate", questions3.get(0).getRate());
            ArrayList<QuestionDTO> questions4 = survey.getQuestions();
            z65.e(questions4);
            mb5Var.z("text", questions4.get(0).getText());
        }
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        return mb5Var;
    }

    public final mb5 createReopenThreadMessage(UserInfoBuilder userInfoBuilder) {
        z65.h(userInfoBuilder, "userInfo");
        mb5 mb5Var = new mb5();
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.z(MessageAttributes.TYPE, "REOPEN_THREAD");
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        return mb5Var;
    }

    public final mb5 createResolveThreadMessage(UserInfoBuilder userInfoBuilder) {
        z65.h(userInfoBuilder, "userInfo");
        mb5 mb5Var = new mb5();
        mb5Var.z(MessageAttributes.CLIENT_ID, userInfoBuilder.getClientId());
        mb5Var.z(MessageAttributes.TYPE, "CLOSE_THREAD");
        mb5Var.z("appMarker", userInfoBuilder.getAppMarker());
        return mb5Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|2|3|(3:78|79|(12:81|(1:83)(1:88)|84|(1:86)|6|7|8|9|10|(4:12|13|(2:15|(2:17|(1:19)(2:64|65)))|(1:67)(2:68|69))(2:70|(2:72|73))|20|(13:22|23|24|(1:26)|27|(1:29)(1:62)|30|(1:32)|33|(8:35|(1:39)|(1:41)|42|(1:47)|48|(1:52)|53)|54|(1:59)|60)(12:63|24|(0)|27|(0)(0)|30|(0)|33|(0)|54|(2:57|59)|60)))|5|6|7|8|9|10|(0)(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        r16 = "";
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #3 {Exception -> 0x00a5, blocks: (B:19:0x007f, B:21:0x0085, B:24:0x008d, B:26:0x0093, B:38:0x00bb, B:29:0x009f, B:30:0x00a4, B:34:0x00aa, B:35:0x00af, B:36:0x00b0, B:42:0x00c6, B:43:0x00cb), top: B:96:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0 A[Catch: Exception -> 0x00a5, TryCatch #3 {Exception -> 0x00a5, blocks: (B:19:0x007f, B:21:0x0085, B:24:0x008d, B:26:0x0093, B:38:0x00bb, B:29:0x009f, B:30:0x00a4, B:34:0x00aa, B:35:0x00af, B:36:0x00b0, B:42:0x00c6, B:43:0x00cb), top: B:96:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mb5 createUserPhraseMessage(im.threads.business.models.UserPhrase r19, im.threads.business.models.ConsultInfo r20, java.lang.String r21, java.lang.String r22, im.threads.business.UserInfoBuilder r23) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.OutgoingMessageCreator.createUserPhraseMessage(im.threads.business.models.UserPhrase, im.threads.business.models.ConsultInfo, java.lang.String, java.lang.String, im.threads.business.UserInfoBuilder):mb5");
    }

    private final ca5 attachmentsFromFileDescription(FileDescription fileDescription, String str) {
        if (fileDescription != null) {
            r0 = fileDescription.getFileUri() != null ? attachmentsFromFileDescription(fileDescription) : null;
            if (fileDescription.getDownloadPath() != null) {
                r0 = attachmentsFromMfmsPath(fileDescription);
            }
        }
        if (r0 != null) {
            pa5 x = r0.x(0);
            z65.f(x, "null cannot be cast to non-null type com.google.gson.JsonObject");
            ((mb5) x).z("result", str);
        }
        return r0;
    }
}
