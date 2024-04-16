package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: TextViewAfterTextChangeEventFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0004"}, d2 = {"Landroid/widget/TextView;", "Lr25;", "Lbb;", "a", "flowbinding-android_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: bdb  reason: default package */
/* loaded from: classes3.dex */
public final class bdb {

    /* compiled from: TextViewAfterTextChangeEventFlow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ldl8;", "Lbb;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "reactivecircus.flowbinding.android.widget.TextViewAfterTextChangeEventFlowKt$afterTextChanges$1", f = "TextViewAfterTextChangeEventFlow.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: bdb$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements Function2<dl8<? super bb>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ TextView c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TextViewAfterTextChangeEventFlow.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: bdb$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0067a extends ej5 implements Function0<Unit> {
            final /* synthetic */ TextView a;
            final /* synthetic */ b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0067a(TextView textView, b bVar) {
                super(0);
                this.a = textView;
                this.b = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.removeTextChangedListener(this.b);
            }
        }

        /* compiled from: TextViewAfterTextChangeEventFlow.kt */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"bdb$a$b", "Landroid/text/TextWatcher;", "", Image.TYPE_SMALL, "", "start", "count", "after", "", "beforeTextChanged", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "flowbinding-android_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: bdb$a$b */
        /* loaded from: classes3.dex */
        public static final class b implements TextWatcher {
            final /* synthetic */ dl8<bb> a;
            final /* synthetic */ TextView b;

            /* JADX WARN: Multi-variable type inference failed */
            b(dl8<? super bb> dl8Var, TextView textView) {
                this.a = dl8Var;
                this.b = textView;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                z65.h(editable, Image.TYPE_SMALL);
                this.a.h(new bb(this.b, editable));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                z65.h(charSequence, Image.TYPE_SMALL);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                z65.h(charSequence, Image.TYPE_SMALL);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextView textView, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = textView;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(dl8<? super bb> dl8Var, cv1<? super Unit> cv1Var) {
            return ((a) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                dl8 dl8Var = (dl8) this.b;
                i31.a();
                b bVar = new b(dl8Var, this.c);
                this.c.addTextChangedListener(bVar);
                C0067a c0067a = new C0067a(this.c, bVar);
                this.a = 1;
                if (bl8.a(dl8Var, c0067a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: TextViewAfterTextChangeEventFlow.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lbb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: bdb$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function0<bb> {
        final /* synthetic */ TextView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TextView textView) {
            super(0);
            this.a = textView;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final bb invoke() {
            TextView textView = this.a;
            return new bb(textView, textView.getEditableText());
        }
    }

    public static final r25<bb> a(TextView textView) {
        z65.h(textView, "<this>");
        return s25.a(wz3.m(wz3.g(new a(textView, null))), new b(textView));
    }
}
