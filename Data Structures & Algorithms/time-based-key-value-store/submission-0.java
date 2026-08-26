class TimeMap {
    private class Entry{
        String value;
        int timestamp;
        Entry(String value, int timestamp){
            this.value =value;
            this.timestamp = timestamp;

        }

    }
    private Map<String, List<Entry>> map;
    public TimeMap() {
        map = new HashMap<>();
            }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Entry(value, timestamp));
        
    }
    
    public String get(String key, int timestamp){
     if (!map.containsKey(key)) {
            return "";
        }

        List<Entry> entries = map.get(key);

        int left = 0;
        int right = entries.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (entries.get(mid).timestamp <= timestamp) {
                result = entries.get(mid).value;

            
                left = mid + 1;
            } else {
                
                right = mid - 1;
            }
        }

        return result;
    }
}