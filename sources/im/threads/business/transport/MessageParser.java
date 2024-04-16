package im.threads.business.transport;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.config.BaseConfig;
import im.threads.business.formatters.ChatItemType;
import im.threads.business.formatters.SpeechStatus;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.ChatItem;
import im.threads.business.models.ConsultConnectionMessage;
import im.threads.business.models.FileDescription;
import im.threads.business.models.MessageRead;
import im.threads.business.models.MessageStatus;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.Quote;
import im.threads.business.models.RequestResolveThread;
import im.threads.business.models.SearchingConsult;
import im.threads.business.models.SimpleSystemMessage;
import im.threads.business.models.SpeechMessageUpdate;
import im.threads.business.models.Survey;
import im.threads.business.transport.models.Attachment;
import im.threads.business.transport.models.Operator;
import im.threads.business.transport.models.OperatorJoinedContent;
import im.threads.business.transport.models.RequestResolveThreadContent;
import im.threads.business.transport.models.SpeechMessageUpdatedContent;
import im.threads.business.transport.models.SurveyContent;
import im.threads.business.transport.models.SystemMessageContent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
/* compiled from: MessageParser.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J.\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0014H\u0002J$\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006#"}, d2 = {"Lim/threads/business/transport/MessageParser;", "", "Lmb5;", "fullMessage", "Lim/threads/business/models/MessageRead;", "getMessageRead", "", "sentAt", "Lim/threads/business/models/ConsultConnectionMessage;", "getConsultConnection", "Lim/threads/business/models/SimpleSystemMessage;", "getSystemMessage", "Lim/threads/business/models/Survey;", "getSurvey", "Lim/threads/business/models/RequestResolveThread;", "getRequestResolveThread", "", "shortMessage", "Lim/threads/business/models/ChatItem;", "getPhrase", "", "Lim/threads/business/transport/models/Attachment;", MessageAttributes.ATTACHMENTS, RemoteMessageConst.FROM, "timeStamp", "Lim/threads/business/models/FileDescription;", "getFileDescription", "Lim/threads/business/transport/models/Quote;", MessageAttributes.QUOTES, "Lim/threads/business/models/Quote;", "getQuote", "format", "getType", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MessageParser {

    /* compiled from: MessageParser.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatItemType.values().length];
            try {
                iArr[ChatItemType.CLIENT_BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatItemType.THREAD_ENQUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatItemType.AVERAGE_WAIT_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatItemType.PARTING_AFTER_SURVEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatItemType.THREAD_CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChatItemType.THREAD_WILL_BE_REASSIGNED.ordinal()] = 6;
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
                iArr[ChatItemType.REQUEST_CLOSE_THREAD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ChatItemType.OPERATOR_LOOKUP_STARTED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ChatItemType.NONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ChatItemType.MESSAGES_READ.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ChatItemType.SCENARIO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ChatItemType.ATTACHMENT_SETTINGS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ChatItemType.SPEECH_MESSAGE_UPDATED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ChatItemType.MESSAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ChatItemType.MESSAGE_EDITED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ChatItemType.MESSAGE_DELETED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ChatItemType.MIRROR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ChatItemType.ON_HOLD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final ConsultConnectionMessage getConsultConnection(long j, mb5 mb5Var) {
        boolean v;
        OperatorJoinedContent operatorJoinedContent = (OperatorJoinedContent) BaseConfig.Companion.getInstance().gson.g(mb5Var, OperatorJoinedContent.class);
        Operator operator = operatorJoinedContent.getOperator();
        String uuid = operatorJoinedContent.getUuid();
        z65.e(operator);
        String valueOf = String.valueOf(operator.getId());
        String type = operatorJoinedContent.getType();
        String aliasOrName = operator.getAliasOrName();
        v = l0b.v("male", operator.getGender(), true);
        return new ConsultConnectionMessage(uuid, valueOf, type, aliasOrName, v, j, operator.getPhotoUrl(), operator.getStatus(), null, operator.getOrganizationUnit(), operator.getRole(), operatorJoinedContent.getDisplay(), operatorJoinedContent.getText(), operatorJoinedContent.getThreadId());
    }

    private final FileDescription getFileDescription(List<Attachment> list, String str, long j) {
        List<Attachment> list2 = list;
        if (list2 != null && !list2.isEmpty() && list.get(0) != null) {
            Attachment attachment = list.get(0);
            z65.e(attachment);
            FileDescription fileDescription = new FileDescription(str, null, attachment.getSize(), j);
            fileDescription.setDownloadPath(attachment.getResult());
            fileDescription.setOriginalPath(attachment.getOriginalUrl());
            fileDescription.setIncomingName(attachment.getName());
            fileDescription.setMimeType(attachment.getType());
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

    private final MessageRead getMessageRead(mb5 mb5Var) {
        List l;
        List o;
        String h = mb5Var.B(MessageAttributes.READ_MESSAGE_ID).h();
        z65.g(h, "fullMessage[MessageAttri…READ_MESSAGE_ID].asString");
        List<String> j = new ec9(",").j(h, 0);
        if (!j.isEmpty()) {
            ListIterator<String> listIterator = j.listIterator(j.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    l = sc1.B0(j, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        l = kc1.l();
        String[] strArr = (String[]) l.toArray(new String[0]);
        o = kc1.o(Arrays.copyOf(strArr, strArr.length));
        return new MessageRead(o);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final im.threads.business.models.ChatItem getPhrase(long r28, java.lang.String r30, defpackage.mb5 r31) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.transport.MessageParser.getPhrase(long, java.lang.String, mb5):im.threads.business.models.ChatItem");
    }

    private final Quote getQuote(List<im.threads.business.transport.models.Quote> list) {
        String str;
        long currentTimeMillis;
        List<Attachment> list2;
        FileDescription fileDescription;
        String str2;
        Date receivedDate;
        Operator operator;
        List<im.threads.business.transport.models.Quote> list3 = list;
        if (list3 != null && !list3.isEmpty() && list.get(0) != null) {
            im.threads.business.transport.models.Quote quote = list.get(0);
            if (quote != null && (operator = quote.getOperator()) != null) {
                str = operator.getAliasOrName();
            } else {
                str = null;
            }
            if (quote != null && (receivedDate = quote.getReceivedDate()) != null) {
                currentTimeMillis = receivedDate.getTime();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j = currentTimeMillis;
            if (quote != null) {
                list2 = quote.getAttachments();
            } else {
                list2 = null;
            }
            if (list2 != null) {
                fileDescription = getFileDescription(quote.getAttachments(), str, j);
            } else {
                fileDescription = null;
            }
            if (quote != null) {
                str2 = quote.getUuid();
            } else {
                str2 = null;
            }
            if (str2 != null && (quote.getText() != null || fileDescription != null)) {
                return new Quote(quote.getUuid(), str, quote.getText(), fileDescription, j, quote.getModified());
            }
        }
        return null;
    }

    private final RequestResolveThread getRequestResolveThread(long j, mb5 mb5Var) {
        RequestResolveThreadContent requestResolveThreadContent = (RequestResolveThreadContent) BaseConfig.Companion.getInstance().gson.g(mb5Var, RequestResolveThreadContent.class);
        return new RequestResolveThread(requestResolveThreadContent.getUuid(), requestResolveThreadContent.getHideAfter(), j, requestResolveThreadContent.getThreadId(), false);
    }

    private final Survey getSurvey(long j, mb5 mb5Var) {
        BaseConfig.Companion companion = BaseConfig.Companion;
        SurveyContent surveyContent = (SurveyContent) companion.getInstance().gson.g(mb5Var, SurveyContent.class);
        Survey survey = (Survey) companion.getInstance().gson.k(String.valueOf(surveyContent.getContent()), Survey.class);
        survey.setUuid(surveyContent.getUuid());
        survey.setTimeStamp(j);
        survey.setSentState(MessageStatus.FAILED);
        survey.setDisplayMessage(true);
        survey.setRead(false);
        ArrayList<QuestionDTO> questions = survey.getQuestions();
        if (questions == null) {
            questions = new ArrayList<>();
        }
        Iterator<QuestionDTO> it = questions.iterator();
        while (it.hasNext()) {
            it.next().setPhraseTimeStamp(j);
        }
        z65.g(survey, "survey");
        return survey;
    }

    private final SimpleSystemMessage getSystemMessage(long j, mb5 mb5Var) {
        SystemMessageContent systemMessageContent = (SystemMessageContent) BaseConfig.Companion.getInstance().gson.g(mb5Var, SystemMessageContent.class);
        return new SimpleSystemMessage(systemMessageContent.getUuid(), systemMessageContent.getType(), j, systemMessageContent.getText(), systemMessageContent.getThreadId());
    }

    public final ChatItem format(long j, String str, mb5 mb5Var) {
        if (mb5Var == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[ChatItemType.Companion.fromString(getType(mb5Var)).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return getSystemMessage(j, mb5Var);
            case 9:
            case 10:
                return getConsultConnection(j, mb5Var);
            case 11:
                return getSurvey(j, mb5Var);
            case 12:
                return getRequestResolveThread(j, mb5Var);
            case 13:
                return new SearchingConsult();
            case 14:
            case 15:
                return getMessageRead(mb5Var);
            case 16:
            case 17:
                return null;
            case 18:
                SpeechMessageUpdatedContent speechMessageUpdatedContent = (SpeechMessageUpdatedContent) BaseConfig.Companion.getInstance().gson.g(mb5Var, SpeechMessageUpdatedContent.class);
                String component1 = speechMessageUpdatedContent.component1();
                String component2 = speechMessageUpdatedContent.component2();
                List<Attachment> component3 = speechMessageUpdatedContent.component3();
                if (component1 != null && component3 != null) {
                    SpeechStatus fromString = SpeechStatus.Companion.fromString(component2);
                    FileDescription fileDescription = getFileDescription(component3, null, j);
                    z65.e(fileDescription);
                    return new SpeechMessageUpdate(component1, fromString, fileDescription);
                }
                LoggerEdna.error("SPEECH_MESSAGE_UPDATED with invalid params");
                return null;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return getPhrase(j, str, mb5Var);
            default:
                return getPhrase(j, str, mb5Var);
        }
    }

    public final String getType(mb5 mb5Var) {
        z65.h(mb5Var, "fullMessage");
        String h = mb5Var.B(MessageAttributes.TYPE).h();
        z65.g(h, "fullMessage[MessageAttributes.TYPE].asString");
        return h;
    }
}
