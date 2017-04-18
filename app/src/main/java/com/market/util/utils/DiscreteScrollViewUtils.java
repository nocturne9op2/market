package com.market.util.utils;

import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.yarolegovich.discretescrollview.DiscreteScrollView;

public class DiscreteScrollViewUtils {
    public static void smoothScrollToUserSelectedPosition(final DiscreteScrollView scrollView, View anchor) {
        PopupMenu popupMenu = new PopupMenu(scrollView.getContext(), anchor);
        Menu menu = popupMenu.getMenu();
        for (int i = 0; i < scrollView.getAdapter().getItemCount(); i++) {
            menu.add(String.valueOf(i + 1));
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int destination = Integer.parseInt(String.valueOf(item.getTitle())) - 1;
                scrollView.smoothScrollToPosition(destination);
                return true;
            }
        });
        popupMenu.show();
    }

    public static int getTransitionTime() {
        return 150;
    }
}