package be.wegenenverkeer.autodesk.service;

import be.wegenenverkeer.autodesk.domain.CreateFolder;
import be.wegenenverkeer.autodesk.domain.ExtendedVersion;
import be.wegenenverkeer.autodesk.domain.JsonApiCollectionFolders;
import be.wegenenverkeer.autodesk.domain.ResourceCollection;
import com.autodesk.client.ApiException;
import com.autodesk.client.ApiResponse;
import com.autodesk.client.Pair;
import com.autodesk.client.api.FoldersApi;
import com.autodesk.client.auth.Authentication;
import com.autodesk.client.auth.Credentials;
import com.autodesk.client.model.Folder;
import com.sun.jersey.api.client.GenericType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Functies die ontbreken in de Java Forge SDK
 */
public class ExtendedVersionsApi extends FoldersApi {

    /**
     * Eigen versie van getItemTip die ExtendedVersion klasse teruggeeft met completere storage relatie om objectId te achterhalen
     * van bestand in bucket
     */
    public ApiResponse<ExtendedVersion> getItemTip(String projectId, String itemId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling getItemTip");
        }

        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new ApiException(400, "Missing the required parameter 'itemId' when calling getItemTip");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/items/{item_id}/tip"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "item_id" + "\\}", getApiClient().escapeString(itemId));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/vnd.api+json", "application/json"
        };
        final String localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/vnd.api+json"
        };
        final String localVarContentType = getApiClient().selectHeaderContentType(localVarContentTypes);

        GenericType<ExtendedVersion> localVarReturnType = new GenericType<ExtendedVersion>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }


    /**
     * Eigen versie van getVersion die ExtendedVersion klasse teruggeeft met completere storage relaties
     */
    public ApiResponse<ExtendedVersion> getVersion(String projectId, String versionId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersion");
        }

        // verify the required parameter 'itemId' is set
        if (versionId == null) {
            throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersion");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "version_id" + "\\}", getApiClient().escapeString(versionId));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/vnd.api+json", "application/json"
        };
        final String localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/vnd.api+json"
        };
        final String localVarContentType = getApiClient().selectHeaderContentType(localVarContentTypes);

        GenericType<ExtendedVersion> localVarReturnType = new GenericType<ExtendedVersion>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }

    /**
     * Eigen versie van getVersion die ExtendedVersion klasse teruggeeft met completere storage relaties
     */
    public ApiResponse<ExtendedVersion> getItemFromVersion(String projectId, String versionId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling getVersion");
        }

        // verify the required parameter 'itemId' is set
        if (versionId == null) {
            throw new ApiException(400, "Missing the required parameter 'versionId' when calling getVersion");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/versions/{version_id}/item"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "version_id" + "\\}", getApiClient().escapeString(versionId));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
                "application/vnd.api+json", "application/json"
        };
        final String localVarAccept = getApiClient().selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/vnd.api+json"
        };
        final String localVarContentType = getApiClient().selectHeaderContentType(localVarContentTypes);

        GenericType<ExtendedVersion> localVarReturnType = new GenericType<ExtendedVersion>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }
}
