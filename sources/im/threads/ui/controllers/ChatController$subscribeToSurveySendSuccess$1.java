package im.threads.ui.controllers;

import im.threads.business.models.Survey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "survey", "Lim/threads/business/models/Survey;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToSurveySendSuccess$1 extends ej5 implements Function1<Survey, Unit> {
    final /* synthetic */ ChatController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatController$subscribeToSurveySendSuccess$1(ChatController chatController) {
        super(1);
        this.this$0 = chatController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Survey survey) {
        invoke2(survey);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Survey survey) {
        z65.h(survey, "survey");
        this.this$0.surveyCompletionInProgress = false;
        this.this$0.setSurveyStateSent(survey);
        this.this$0.resetActiveSurvey();
    }
}
