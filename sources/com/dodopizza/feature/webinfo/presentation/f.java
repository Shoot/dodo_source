package com.dodopizza.feature.webinfo.presentation;

import com.dodopizza.feature.webinfo.presentation.a;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.File;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: WebInfoView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'J\b\u0010\u0012\u001a\u00020\u0004H'¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/feature/webinfo/presentation/f;", "Lmoxy/MvpView;", "", ElementGenerator.TYPE_LINK, "", "pb", "Ve", "", "visible", "Fd", "Lcom/dodopizza/feature/webinfo/presentation/a$b;", "title", "Ib", "showProgressBar", "hideProgressBar", "Ljava/io/File;", ElementGenerator.TYPE_IMAGE, "A5", "Bb", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface f extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void A5(File file);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Bb();

    void Fd(boolean z);

    void Ib(a.b bVar);

    void Ve(String str);

    void hideProgressBar();

    void pb(String str);

    void showProgressBar();
}
