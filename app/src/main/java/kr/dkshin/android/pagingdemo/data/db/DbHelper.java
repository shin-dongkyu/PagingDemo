/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package kr.dkshin.android.pagingdemo.data.db;


import java.util.List;

import io.reactivex.Single;
import kr.dkshin.android.pagingdemo.data.db.dao.UserDao;
import kr.dkshin.android.pagingdemo.data.model.User;

/**
 * Created by SHIN on 2018. 8. 8..
 */

public interface DbHelper {
    UserDao getUserDao();
    Single<Boolean> insertUserList(final List<User> collectionList);
}
