package com.dodopizza.feature.webinfo.presentation;

import com.dodopizza.feature.webinfo.presentation.a;
import java.io.File;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: WebInfoView$$State.java */
/* loaded from: classes.dex */
public class e extends MvpViewState<com.dodopizza.feature.webinfo.presentation.f> implements com.dodopizza.feature.webinfo.presentation.f {

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        a() {
            super("cancelImagePicking", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.Bb();
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        public final File a;

        b(File file) {
            super("deliverPickedImage", OneExecutionStateStrategy.class);
            this.a = file;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.A5(this.a);
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        c() {
            super("hideProgressBar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.hideProgressBar();
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        public final String a;

        d(String str) {
            super("openLink", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.pb(this.a);
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* renamed from: com.dodopizza.feature.webinfo.presentation.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0128e extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        public final boolean a;

        C0128e(boolean z) {
            super("setShareButtonVisible", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.Fd(this.a);
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        public final a.b a;

        f(a.b bVar) {
            super("setToolbarTitle", AddToEndSingleStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.Ib(this.a);
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        public final String a;

        g(String str) {
            super("shareLink", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.Ve(this.a);
        }
    }

    /* compiled from: WebInfoView$$State.java */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<com.dodopizza.feature.webinfo.presentation.f> {
        h() {
            super("showProgressBar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.feature.webinfo.presentation.f fVar) {
            fVar.showProgressBar();
        }
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void A5(File file) {
        b bVar = new b(file);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A5(file);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Bb() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Bb();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Fd(boolean z) {
        C0128e c0128e = new C0128e(z);
        this.viewCommands.beforeApply(c0128e);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Fd(z);
        }
        this.viewCommands.afterApply(c0128e);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Ib(a.b bVar) {
        f fVar = new f(bVar);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ib(bVar);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void Ve(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ve(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void hideProgressBar() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.hideProgressBar();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void pb(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.pb(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // com.dodopizza.feature.webinfo.presentation.f
    public void showProgressBar() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.showProgressBar();
        }
        this.viewCommands.afterApply(hVar);
    }
}
