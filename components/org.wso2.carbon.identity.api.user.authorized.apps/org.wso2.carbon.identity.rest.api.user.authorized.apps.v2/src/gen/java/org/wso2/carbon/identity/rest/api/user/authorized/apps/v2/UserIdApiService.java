/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.user.authorized.apps.v2;

import org.wso2.carbon.identity.rest.api.user.authorized.apps.v2.*;
import org.wso2.carbon.identity.rest.api.user.authorized.apps.v2.dto.*;

import org.wso2.carbon.identity.rest.api.user.authorized.apps.v2.dto.ErrorDTO;
import org.wso2.carbon.identity.rest.api.user.authorized.apps.v2.dto.AuthorizedAppDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class UserIdApiService {

    public abstract Response deleteUserAuthorizedApps(String userId);

    public abstract Response deleteUserAuthorizedAppsByAppId(String userId, String applicationId);

    public abstract Response listUserAuthorizedApps(String userId);

    public abstract Response listUserAuthorizedAppsByAppId(String userId, String applicationId);

}
