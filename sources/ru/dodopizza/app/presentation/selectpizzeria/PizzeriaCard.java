package ru.dodopizza.app.presentation.selectpizzeria;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectpizzeria.PizzeriaCard;
/* loaded from: classes4.dex */
public class PizzeriaCard extends NestedScrollView {
    private TextView I;
    private TextView S4;
    private TextView T4;
    private TextView U4;
    private LinearLayout V4;
    private TextView W4;
    private TextView X4;
    private TextView Y4;
    private TextView Z4;
    private TextView a5;
    private RelativeLayout b5;
    private RelativeLayout c5;
    private RelativeLayout d5;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);
    }

    public PizzeriaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Q(context);
    }

    private void Q(Context context) {
        View inflate = View.inflate(context, R.layout.pizzeria_card, this);
        this.I = (TextView) inflate.findViewById(R.id.name_pizzeria_text);
        this.S4 = (TextView) inflate.findViewById(R.id.street_pizzeria_text);
        this.T4 = (TextView) inflate.findViewById(R.id.status_pizzeria_text);
        this.U4 = (TextView) inflate.findViewById(R.id.operational_type_text);
        this.V4 = (LinearLayout) inflate.findViewById(R.id.operational_type_container);
        this.X4 = (TextView) inflate.findViewById(R.id.delivery_and_pickup_time_text);
        this.Y4 = (TextView) inflate.findViewById(R.id.restaurant_time_text);
        this.a5 = (TextView) inflate.findViewById(R.id.phone_text);
        this.Z4 = (TextView) inflate.findViewById(R.id.work_time);
        this.b5 = (RelativeLayout) inflate.findViewById(R.id.restaurant_work_time);
        this.d5 = (RelativeLayout) inflate.findViewById(R.id.delivery_work_time);
        this.c5 = (RelativeLayout) inflate.findViewById(R.id.equal_work_time);
        this.W4 = (TextView) inflate.findViewById(R.id.title_delivery_work_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(a aVar, View view) {
        aVar.a(this.a5.getText().toString());
    }

    public void S(d88 d88Var, jb7 jb7Var, gn3 gn3Var, Boolean bool) {
        if (gn3Var == gn3.b && d88Var.G().contains(ib7.e)) {
            this.W4.setText(getResources().getString(R.string.delivery));
        } else {
            this.W4.setText(getResources().getString(R.string.delivery_and_pickup_time));
        }
        this.I.setText(d88Var.getName());
        if (bool.booleanValue()) {
            this.S4.setText(d88Var.u());
        } else {
            this.S4.setText(d88Var.q());
        }
        this.a5.setText(d88Var.E());
        this.T4.setText(ov9.e(d88Var.H(), d88Var.L(), getContext()));
        if (jb7Var == jb7.e) {
            this.V4.setVisibility(0);
            this.U4.setText(getResources().getString(R.string.delivery_only_order_type_label));
        } else if (jb7Var == jb7.d) {
            this.V4.setVisibility(0);
            this.U4.setText(getResources().getString(R.string.carryout_only_order_type_label));
        } else {
            this.V4.setVisibility(8);
        }
        if (d88Var.H().equals(d88Var.o())) {
            this.c5.setVisibility(0);
            this.b5.setVisibility(8);
            this.d5.setVisibility(8);
            this.Z4.setText(ov9.a(d88Var.o(), getContext()));
            return;
        }
        this.c5.setVisibility(8);
        this.b5.setVisibility(0);
        this.d5.setVisibility(0);
        this.X4.setText(ov9.a(d88Var.o(), getContext()));
        this.Y4.setText(ov9.a(d88Var.H(), getContext()));
    }

    public void setPhoneTextListener(final a aVar) {
        this.a5.setOnClickListener(new View.OnClickListener() { // from class: e88
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PizzeriaCard.this.R(aVar, view);
            }
        });
    }
}
