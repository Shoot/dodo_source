package im.threads.business.rest.models;

import im.threads.business.models.ConsultInfo;
import im.threads.business.models.MessageFromHistory;
import im.threads.business.transport.models.Operator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HistoryResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lim/threads/business/rest/models/HistoryResponse;", "", "messages", "", "Lim/threads/business/models/MessageFromHistory;", "(Ljava/util/List;)V", "agentInfo", "Lim/threads/business/rest/models/HistoryResponse$AgentInfo;", "getMessages", "()Ljava/util/List;", "getConsultInfo", "Lim/threads/business/models/ConsultInfo;", "AgentInfo", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryResponse {
    private final AgentInfo agentInfo;
    private final List<MessageFromHistory> messages;

    /* compiled from: HistoryResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lim/threads/business/rest/models/HistoryResponse$AgentInfo;", "", "(Lim/threads/business/rest/models/HistoryResponse;)V", "agent", "Lim/threads/business/transport/models/Operator;", "getAgent", "()Lim/threads/business/transport/models/Operator;", "setAgent", "(Lim/threads/business/transport/models/Operator;)V", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private final class AgentInfo {
        private Operator agent;

        public AgentInfo() {
        }

        public final Operator getAgent() {
            return this.agent;
        }

        public final void setAgent(Operator operator) {
            this.agent = operator;
        }
    }

    public HistoryResponse(List<MessageFromHistory> list) {
        z65.h(list, "messages");
        this.messages = list;
    }

    public final ConsultInfo getConsultInfo() {
        Operator agent;
        AgentInfo agentInfo = this.agentInfo;
        if (agentInfo != null && (agent = agentInfo.getAgent()) != null) {
            return new ConsultInfo(agent.getAliasOrName(), String.valueOf(agent.getId()), agent.getStatus(), agent.getOrganizationUnit(), agent.getPhotoUrl(), agent.getRole());
        }
        return null;
    }

    public final List<MessageFromHistory> getMessages() {
        return this.messages;
    }
}
