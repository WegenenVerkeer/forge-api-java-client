package be.wegenenverkeer.autodesk.service;

import be.wegenenverkeer.autodesk.domain.CreateFolder;
import be.wegenenverkeer.autodesk.domain.ExtendedVersion;
import be.wegenenverkeer.autodesk.domain.ResourceCollection;
import be.wegenenverkeer.autodesk.domain.JsonApiCollectionFolders;
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
public class ExtendedFoldersApi extends FoldersApi {

    /**
     * Geef alle folders terug onder een bepaalde folder id
     */
    public ApiResponse<JsonApiCollectionFolders> getFolders(String projectId, String folderId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderContents");
        }

        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderContents");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/contents"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "folder_id" + "\\}", getApiClient().escapeString(folderId));

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

        GenericType<JsonApiCollectionFolders> localVarReturnType = new GenericType<JsonApiCollectionFolders>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }

    /**
     * Geef alle topFolders terug van een project
     */
    public ApiResponse<JsonApiCollectionFolders> topFolders(String hubId, String projectId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling postVersion");
        }

        // create path and map variables
        String localVarPath = "/project/v1/hubs/{hub_id}/projects/{project_id}/topFolders"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "hub_id" + "\\}", getApiClient().escapeString(hubId));

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

        GenericType<JsonApiCollectionFolders> localVarReturnType = new GenericType<JsonApiCollectionFolders>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }

    /**
     * Maak folder binnen een project aan
     */
    public ApiResponse<Folder> postFolder(String projectId, CreateFolder body, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = body;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling postFolder");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling postFolder");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/folders"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId));

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

        GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }


    /**
     * Geef alle folders terug onder een bepaalde folder id
     */
    public ApiResponse<ResourceCollection> getContents(String projectId, String folderId, Authentication oauth2, Credentials credentials) throws ApiException, Exception {

        Object localVarPostBody = null;

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException(400, "Missing the required parameter 'projectId' when calling getFolderContents");
        }

        // verify the required parameter 'folderId' is set
        if (folderId == null) {
            throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolderContents");
        }

        // create path and map variables
        String localVarPath = "/data/v1/projects/{project_id}/folders/{folder_id}/contents"
                .replaceAll("\\{" + "project_id" + "\\}", getApiClient().escapeString(projectId))
                .replaceAll("\\{" + "folder_id" + "\\}", getApiClient().escapeString(folderId));

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

        GenericType<ResourceCollection> localVarReturnType = new GenericType<ResourceCollection>() {};
        return getApiClient().invokeAPI(oauth2, credentials, localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarReturnType);
    }
}
