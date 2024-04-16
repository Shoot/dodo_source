package im.threads.ui.holders.helper;

import im.threads.business.models.ChatItem;
import im.threads.business.models.QuestionDTO;
import im.threads.business.models.Survey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SurveySplitter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"splitSurveyQuestions", "", "Lim/threads/business/models/ChatItem;", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SurveySplitterKt {
    public static final List<ChatItem> splitSurveyQuestions(List<? extends ChatItem> list) {
        ArrayList<QuestionDTO> h;
        z65.h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (ChatItem chatItem : list) {
            if (!(chatItem instanceof Survey)) {
                arrayList.add(chatItem);
            } else {
                Survey survey = (Survey) chatItem;
                ArrayList<QuestionDTO> questions = survey.getQuestions();
                if (questions != null) {
                    Iterator<T> it = questions.iterator();
                    while (it.hasNext()) {
                        Survey copy = survey.copy();
                        h = kc1.h((QuestionDTO) it.next());
                        copy.setQuestions(h);
                        arrayList.add(copy);
                    }
                }
            }
        }
        return arrayList;
    }
}
