# Classic Bottom Navigation Bar

## Images from App
<img width="253" alt="Screenshot_2" src="https://user-images.githubusercontent.com/43906043/178354444-6151ead3-d7bb-4ce6-8dc0-201c756abab1.png"> <img width="253" alt="Screenshot_3" src="https://user-images.githubusercontent.com/43906043/178354448-1b6329be-72cf-4042-9dae-2dccc2696556.png"> <img width="253" alt="Screenshot_4" src="https://user-images.githubusercontent.com/43906043/178354449-696d2f09-d276-4f41-8084-ad13d562d3f7.png">

<br/>

- we need;
- 3 fragment(and xml files),
- 1 activity(for binding)
- 1 bottom_nav.xml(inside menu resource directory)
- 1 rounded.xml(inside drawable directory)

---------------

<br/>

### for bottom nav bar's shape(we create rounded.xml inside drawable directory):

```
<shape xmlns:android="http://schemas.android.com/apk/res/android">

    <solid android:color="#BBBFCC"/>

    <corners
       android:topLeftRadius="80dp"
       android:topRightRadius="80dp"
        android:bottomLeftRadius="80dp"
        android:bottomRightRadius="80dp"/>

</shape>
```

### for menu items(we use for bottom nav.)

```
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:title="Home"
        android:id="@+id/home"
        android:icon="@drawable/ic_baseline_home_24"/>

    <item android:title="Profile"
        android:id="@+id/profile"
        android:icon="@drawable/ic_baseline_person_24"/>

    <item android:title="Settings"
        android:id="@+id/settings"
        android:icon="@drawable/ic_baseline_settings_24"/>

</menu>
```
