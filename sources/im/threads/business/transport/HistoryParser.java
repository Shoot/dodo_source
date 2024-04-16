package im.threads.business.transport;

import im.threads.business.formatters.ChatItemType;
import im.threads.business.models.Attachment;
import im.threads.business.models.ChatItem;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.Optional;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.Survey;
import im.threads.business.rest.models.HistoryResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: HistoryParser.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0002H\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lim/threads/business/transport/HistoryParser;", "", "", "Lim/threads/business/models/MessageFromHistory;", "messages", "Lim/threads/business/models/ChatItem;", "getChatItems", "message", "Lim/threads/business/models/Survey;", "getCompletedSurveyFromHistory", "Lim/threads/business/models/SimpleSystemMessage;", "getSystemMessageFromHistory", MessageAttributes.QUOTES, "Lim/threads/business/models/Quote;", "quoteFromList", "Lim/threads/business/models/Attachment;", MessageAttributes.ATTACHMENTS, "Lim/threads/business/models/FileDescription;", "fileDescriptionFromList", "Lim/threads/business/rest/models/HistoryResponse;", "response", "Lim/threads/business/transport/HistoryLoader;", "historyLoader$delegate", "Lrn5;", "getHistoryLoader", "()Lim/threads/business/transport/HistoryLoader;", "historyLoader", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class HistoryParser {
    public static final HistoryParser INSTANCE = new HistoryParser();
    private static final rn5 historyLoader$delegate;

    /* compiled from: HistoryParser.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatItemType.values().length];
            try {
                iArr[ChatItemType.THREAD_ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatItemType.AVERAGE_WAIT_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatItemType.PARTING_AFTER_SURVEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatItemType.THREAD_CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatItemType.THREAD_WILL_BE_REASSIGNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChatItemType.CLIENT_BLOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChatItemType.CLIENT_PERSONAL_DATA_PROCESSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChatItemType.THREAD_IN_PROGRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChatItemType.OPERATOR_JOINED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ChatItemType.OPERATOR_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ChatItemType.SURVEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ChatItemType.SURVEY_QUESTION_ANSWER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ChatItemType.REQUEST_CLOSE_THREAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        rn5 b;
        b = yn5.b(HistoryParser$special$$inlined$inject$1.INSTANCE);
        historyLoader$delegate = b;
    }

    private HistoryParser() {
    }

    private final FileDescription fileDescriptionFromList(List<Attachment> list) {
        Attachment attachment;
        Long size;
        if ((!list.isEmpty()) && (attachment = list.get(0)) != null) {
            String name = attachment.getName();
            String type = attachment.getType();
            Optional optional = attachment.getOptional();
            long j = 0;
            if (optional != null && (size = optional.getSize()) != null) {
                j = size.longValue();
            }
            FileDescription fileDescription = new FileDescription(null, null, j, 0L);
            fileDescription.setDownloadPath(attachment.getResult());
            fileDescription.setIncomingName(name);
            fileDescription.setMimeType(type);
            fileDescription.setState(attachment.getState());
            fileDescription.setOfferLink(attachment.getLink());
            if (attachment.getErrorCode() != null) {
                fileDescription.setErrorCode(attachment.getErrorCodeState());
                fileDescription.setErrorMessage(attachment.getErrorMessage());
                return fileDescription;
            }
            return fileDescription;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getChatItems$lambda$5(Function2 function2, Object obj, Object obj2) {
        z65.h(function2, "$tmp0");
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final Survey getCompletedSurveyFromHistory(MessageFromHistory messageFromHistory) {
        long j;
        long j2;
        int i;
        ArrayList<QuestionDTO> h;
        String uuid = messageFromHistory.getUuid();
        Long sendingId = messageFromHistory.getSendingId();
        long j3 = 0;
        if (sendingId != null) {
            j = sendingId.longValue();
        } else {
            j = 0;
        }
        Survey survey = new Survey(uuid, j, messageFromHistory.getTimeStamp(), MessageStatus.READ, messageFromHistory.getRead(), messageFromHistory.isDisplay());
        QuestionDTO questionDTO = new QuestionDTO();
        Long questionId = messageFromHistory.getQuestionId();
        if (questionId != null) {
            j2 = questionId.longValue();
        } else {
            j2 = 0;
        }
        questionDTO.setId(j2);
        questionDTO.setPhraseTimeStamp(messageFromHistory.getTimeStamp());
        questionDTO.setText(messageFromHistory.getText());
        questionDTO.setRate(messageFromHistory.getRate());
        Integer scale = messageFromHistory.getScale();
        if (scale != null) {
            i = scale.intValue();
        } else {
            i = 0;
        }
        questionDTO.setScale(i);
        Long sendingId2 = messageFromHistory.getSendingId();
        if (sendingId2 != null) {
            j3 = sendingId2.longValue();
        }
        questionDTO.setSendingId(j3);
        questionDTO.setSimple(messageFromHistory.isSimple());
        h = kc1.h(questionDTO);
        survey.setQuestions(h);
        return survey;
    }

    private final HistoryLoader getHistoryLoader() {
        return (HistoryLoader) historyLoader$delegate.getValue();
    }

    private final SimpleSystemMessage getSystemMessageFromHistory(MessageFromHistory messageFromHistory) {
        long j;
        String uuid = messageFromHistory.getUuid();
        String type = messageFromHistory.getType();
        long timeStamp = messageFromHistory.getTimeStamp();
        String text = messageFromHistory.getText();
        Long threadId = messageFromHistory.getThreadId();
        if (threadId != null) {
            j = threadId.longValue();
        } else {
            j = 0;
        }
        return new SimpleSystemMessage(uuid, type, timeStamp, text, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.threads.business.models.Quote quoteFromList(java.util.List<im.threads.business.models.MessageFromHistory> r15) {
        /*
            r14 = this;
            r0 = r15
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto Lb2
            r0 = 0
            java.lang.Object r2 = r15.get(r0)
            if (r2 == 0) goto Lb2
            java.lang.Object r15 = r15.get(r0)
            im.threads.business.models.MessageFromHistory r15 = (im.threads.business.models.MessageFromHistory) r15
            defpackage.z65.e(r15)
            java.lang.String r2 = r15.getReceivedDate()
            if (r2 == 0) goto L31
            int r3 = r2.length()
            if (r3 != 0) goto L29
            goto L31
        L29:
            im.threads.business.utils.DateHelper r3 = im.threads.business.utils.DateHelper.INSTANCE
            long r2 = r3.getMessageTimestampFromDateString(r2)
        L2f:
            r9 = r2
            goto L36
        L31:
            long r2 = java.lang.System.currentTimeMillis()
            goto L2f
        L36:
            java.lang.String r2 = r15.getText()
            if (r2 == 0) goto L42
            java.lang.String r2 = r15.getText()
            r7 = r2
            goto L43
        L42:
            r7 = r1
        L43:
            java.util.List r2 = r15.getAttachments()
            if (r2 == 0) goto L79
            java.util.List r2 = r15.getAttachments()
            defpackage.z65.e(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L79
            java.util.List r2 = r15.getAttachments()
            defpackage.z65.e(r2)
            java.lang.Object r0 = r2.get(r0)
            im.threads.business.models.Attachment r0 = (im.threads.business.models.Attachment) r0
            java.lang.String r0 = r0.getResult()
            if (r0 == 0) goto L79
            java.util.List r0 = r15.getAttachments()
            defpackage.z65.e(r0)
            im.threads.business.models.FileDescription r0 = r14.fileDescriptionFromList(r0)
            goto L7a
        L79:
            r0 = r1
        L7a:
            im.threads.business.models.Operator r2 = r15.getOperator()
            if (r2 == 0) goto L86
            java.lang.String r2 = r2.getAliasOrName()
            if (r2 != 0) goto L99
        L86:
            im.threads.business.config.BaseConfig$Companion r2 = im.threads.business.config.BaseConfig.Companion
            im.threads.business.config.BaseConfig r2 = r2.getInstance()
            android.content.Context r2 = r2.context
            int r3 = im.threads.R.string.ecc_I
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "BaseConfig.getInstance()…getString(R.string.ecc_I)"
            defpackage.z65.g(r2, r3)
        L99:
            if (r7 != 0) goto L9d
            if (r0 == 0) goto Lad
        L9d:
            im.threads.business.models.Quote r1 = new im.threads.business.models.Quote
            java.lang.String r5 = r15.getUuid()
            r11 = 0
            r12 = 32
            r13 = 0
            r4 = r1
            r6 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9, r11, r12, r13)
        Lad:
            if (r0 == 0) goto Lb2
            r0.setFrom(r2)
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.HistoryParser.quoteFromList(java.util.List):im.threads.business.models.Quote");
    }

    public final List<ChatItem> getChatItems(HistoryResponse historyResponse) {
        ArrayList arrayList = new ArrayList();
        if (historyResponse != null) {
            List<MessageFromHistory> messages = historyResponse.getMessages();
            List<ChatItem> chatItems = getChatItems(messages);
            getHistoryLoader().setupLastItemIdFromHistory(messages);
            return chatItems;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022f, code lost:
        r5 = defpackage.kc1.m(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:4:0x000b, B:8:0x0015, B:9:0x0019, B:11:0x001f, B:14:0x0028, B:16:0x0038, B:18:0x0046, B:20:0x004c, B:22:0x0052, B:24:0x005c, B:28:0x0067, B:30:0x0081, B:34:0x008c, B:35:0x009a, B:36:0x009d, B:38:0x00a3, B:43:0x00b4, B:45:0x00ba, B:48:0x00c5, B:49:0x00cb, B:51:0x00d1, B:54:0x00de, B:59:0x00ea, B:61:0x00f0, B:65:0x00fd, B:66:0x010e, B:68:0x011a, B:74:0x012a, B:70:0x011e, B:72:0x0124, B:73:0x0127, B:75:0x0153, B:77:0x0167, B:79:0x0170, B:81:0x0180, B:83:0x018d, B:58:0x00e7, B:40:0x00a9, B:42:0x00af, B:85:0x01d4, B:87:0x01de, B:89:0x01e5, B:91:0x01eb, B:93:0x01f3, B:94:0x0201, B:95:0x020b, B:97:0x0213, B:99:0x022f, B:101:0x0235, B:102:0x0239, B:104:0x023f, B:105:0x025b, B:106:0x0260, B:108:0x027a, B:110:0x0283, B:111:0x02a2, B:112:0x02ad), top: B:116:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<im.threads.business.models.ChatItem> getChatItems(java.util.List<im.threads.business.models.MessageFromHistory> r32) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.HistoryParser.getChatItems(java.util.List):java.util.List");
    }
}
