
        //从资源文件中读取json
      private List<AndroidOS> getData(){
    
    InputStream is = getResources().openRawResource(R.raw.android_versions);
    InputStreamReader isr = new InputStreamReader(is);
    Gson gson = new Gson();
    Type listType = new TypeToken<List<AndroidOS>>(){}.getType();
    List<AndroidOS> oss = gson.fromJson(isr, listType);
    return oss;
    }