public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private List<Restaurant> restaurants;
    private Context context;
    
    public RestaurantAdapter(List<Restaurant> restaurants, Context context) {
        this.restaurants = restaurants;
        this.context = context;
    }
    
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant, parent, false);
        return new ViewHolder(view);
    }
    
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurant restaurant = restaurants.get(position);
        holder.tvName.setText(restaurant.getName());
        
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, UpdateActivity.class);
            intent.putExtra("restaurant_id", restaurant.getId());
            intent.putExtra("restaurant_name", restaurant.getName());
            intent.putExtra("restaurant_dishes", restaurant.getDishes());
            context.startActivity(intent);
        });
    }
    
    @Override
    public int getItemCount() {
        return restaurants.size();
    }
    
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
