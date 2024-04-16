package ru.dodopizza.app.presentation.debugtools;

import java.util.ArrayList;
import java.util.List;
import moxy.MvpPresenter;
import moxy.PresenterBinder;
import moxy.presenter.PresenterField;
/* loaded from: classes4.dex */
public class DebugPreferenceFragment$$PresentersBinder extends PresenterBinder<DebugPreferenceFragment> {

    /* compiled from: DebugPreferenceFragment$$PresentersBinder.java */
    /* loaded from: classes4.dex */
    public class a extends PresenterField<DebugPreferenceFragment> {
        public a() {
            super("presenter", null, DebugPreferencePresenter.class);
        }

        @Override // moxy.presenter.PresenterField
        /* renamed from: a */
        public void bind(DebugPreferenceFragment debugPreferenceFragment, MvpPresenter mvpPresenter) {
            debugPreferenceFragment.presenter = (DebugPreferencePresenter) mvpPresenter;
        }

        @Override // moxy.presenter.PresenterField
        /* renamed from: b */
        public MvpPresenter<?> providePresenter(DebugPreferenceFragment debugPreferenceFragment) {
            return debugPreferenceFragment.Lh();
        }
    }

    @Override // moxy.PresenterBinder
    public List<PresenterField<? super DebugPreferenceFragment>> getPresenterFields() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new a());
        return arrayList;
    }
}
