package com.example.deliveryofproducts;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustomDialogFragment extends DialogFragment {

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Заказ оформлен")
                .setIcon(android.R.drawable.ic_dialog_email)
                .setMessage("Для подтверждения заказа, по указанному при регистрации номеру, с вами свяжется наш оператор. В положительном случае, доставка будет осуществлена в течение часа.")
                .setPositiveButton("OK", null)
                .create();
    }
}