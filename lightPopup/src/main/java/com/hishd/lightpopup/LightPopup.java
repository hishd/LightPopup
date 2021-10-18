package com.hishd.lightpopup;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hishd.lightpopup.databinding.DualActionDialogBinding;
import com.hishd.lightpopup.databinding.SingleActionDialogBinding;

public class LightPopup extends Dialog {

    RelativeLayout rootLayout;
    TextView txtTitle;
    TextView txtMessage;
    Button btn1;
    Button btn2;
    Context context;

    private SingleActionDialogBinding singleActionDialogBinding;
    private DualActionDialogBinding dualActionDialogBinding;

    public LightPopup(@NonNull Context context) {
        super(context);
        this.context = context;
        this.setCanceledOnTouchOutside(false);
        singleActionDialogBinding = SingleActionDialogBinding.inflate(getLayoutInflater());
        dualActionDialogBinding = DualActionDialogBinding.inflate(getLayoutInflater());
    }

    public LightPopup setCancelledOnOutside(boolean cancellable) {
        this.setCanceledOnTouchOutside(cancellable);
        return this;
    }

    public LightPopup createSingleActionDialog() {
        this.rootLayout = singleActionDialogBinding.getRoot();
        setContentView(rootLayout);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.txtTitle = singleActionDialogBinding.txtTitle;
        this.txtMessage = singleActionDialogBinding.txtMessage;
        this.btn1 = singleActionDialogBinding.btn1;
        return this;
    }

    public LightPopup createDualActionDialog() {
        this.rootLayout = dualActionDialogBinding.getRoot();
        setContentView(rootLayout);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        this.txtTitle = dualActionDialogBinding.txtTitle;
        this.txtMessage = dualActionDialogBinding.txtMessage;
        this.btn1 = dualActionDialogBinding.btn1;
        this.btn2 = dualActionDialogBinding.btn2;
        return this;
    }

    public LightPopup setTitle(String title) {
        if (this.txtTitle == null)
            return this;
        txtTitle.setText(title);
        return this;
    }

    public LightPopup setMessage(String message) {
        if (this.txtMessage == null)
            return this;
        txtMessage.setText(message);
        return this;
    }

    public LightPopup setBackgroundColor(int color) {
        Drawable background = rootLayout.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public LightPopup setTitleColor(int color) {
        if (txtTitle != null)
            txtTitle.setTextColor(context.getColor(color));
        return this;
    }

    public LightPopup setMessageColor(int color) {
        if (txtMessage != null)
            txtMessage.setTextColor(context.getColor(color));
        return this;
    }

    public LightPopup setBtn1Caption(String text) {
        if (btn1 != null)
            btn1.setText(text);

        return this;
    }

    public LightPopup setBtn2Caption(String text) {
        if (btn2 != null)
            btn2.setText(text);

        return this;
    }

    public LightPopup setBtn1CaptionColor(int textColor) {
        if (btn1 != null)
            btn1.setTextColor(context.getColor(textColor));

        return this;
    }

    public LightPopup setBtn2CaptionColor(int textColor) {
        if (btn2 != null)
            btn2.setTextColor(context.getColor(textColor));

        return this;
    }

    public LightPopup setBtn1AllCaps(boolean allCaps) {
        if (btn1 != null)
            btn1.setAllCaps(allCaps);

        return this;
    }

    public LightPopup setBtn2AllCaps(boolean allCaps) {
        if (btn2 != null)
            btn2.setAllCaps(allCaps);

        return this;
    }

    public LightPopup setBtn1Color(int color) {
        if (btn1 == null)
            return this;

        Drawable background = btn1.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public LightPopup setBtn2Color(int color) {
        if (btn2 == null)
            return this;

        Drawable background = btn2.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(context.getColor(color));
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(context.getColor(color));
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(context.getColor(color));
        }
        return this;
    }

    public LightPopup setBtn1Action(LightPopupDialogListener listener) {
        if (btn1 == null)
            return this;
        btn1.setOnClickListener(v -> {
            listener.onClicked(LightPopup.this);
        });

        return this;
    }

    public LightPopup setBtn2Action(LightPopupDialogListener listener) {
        if (btn2 == null)
            return this;
        btn2.setOnClickListener(v -> {
            listener.onClicked(LightPopup.this);
        });

        return this;
    }

    public interface LightPopupDialogListener {
        void onClicked(Dialog dialog);
    }
}
